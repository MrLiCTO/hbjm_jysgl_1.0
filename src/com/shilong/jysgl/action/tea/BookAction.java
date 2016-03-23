package com.shilong.jysgl.action.tea;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.shilong.jysgl.pojo.po.Book;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Project;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.BookCustom;
import com.shilong.jysgl.pojo.vo.BookQueryVo;
import com.shilong.jysgl.pojo.vo.ProjectCustom;
import com.shilong.jysgl.pojo.vo.ProjectQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.CharData;
import com.shilong.jysgl.process.result.Chart;
import com.shilong.jysgl.process.result.ChartsDataSourceResult;
import com.shilong.jysgl.process.result.DataGridResultInfo;
import com.shilong.jysgl.process.result.ExceptionResultInfo;
import com.shilong.jysgl.process.result.PageQuery;
import com.shilong.jysgl.process.result.ResultInfo;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.process.result.SubmitResultInfo;
import com.shilong.jysgl.service.BookService;
import com.shilong.jysgl.service.DictInfoService;
import com.shilong.jysgl.service.TeacherService;
import com.shilong.jysgl.utils.UUIDBuild;
@RequestMapping("/book")
@Controller
public class BookAction {
	@Resource
	private BookService bookService;
	@Resource
	private TeacherService teacherService;
	@Resource
	private DictInfoService dictInfoService;
	
	@RequestMapping("/booklist")
	public String booklist(Model model)throws Exception{
		
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		
		model.addAttribute("smwc_info", smwc_info);
		
		model.addAttribute("shzt_info", shzt_info);
	
		return "/book/booklist";
	}
	
	@RequestMapping("/booklist_result")
	public @ResponseBody DataGridResultInfo booklist_result(BookQueryVo bookQueryVo,int rows,int page)throws Exception{
		
		int infoCount=bookService.findBookCount(bookQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(infoCount,rows, page);
		
		bookQueryVo.setPageQuery(pageQuery);
		
		List<BookCustom> list = bookService.findBookList(bookQueryVo);
		
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		
		resultInfo.setRows(list);
		
		resultInfo.setTotal(infoCount);
		
		return resultInfo;
		
		
	}
	
	@RequestMapping("/addbook")
	public String addbook(Model model) throws Exception{
		
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		model.addAttribute("smwc_info", smwc_info);
		
		return "/book/addbook";
	}
	
	@RequestMapping("/addbook_submit")
	public @ResponseBody SubmitResultInfo addbook_submit(BookQueryVo bookQueryVo,int[] indexs) throws Exception{
		
		bookService.insertBook(bookQueryVo, indexs);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/editbook")
	public String editbook(String bid,Model model) throws Exception{
		
		Book book = bookService.getBookById(bid);
		
		List<TeacherCustom> teacherCustoms=bookService.getTeasBybId(bid);
		
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		model.addAttribute("smwc_info", smwc_info);
		
		model.addAttribute("bookCustom",book);
		
		model.addAttribute("teacherCustoms",teacherCustoms);
	
		
		return "/book/editbook";
	}
	
	@RequestMapping("/editbook_submit")
	public @ResponseBody DataGridResultInfo editbook_submit(String bid,
			BookQueryVo bookQueryVo,int[] indexs) throws Exception{

		bookService.updateBook(bookQueryVo, indexs, bid);
		
		return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/deletebook_submit")
	public @ResponseBody SubmitResultInfo deletebook_submit(String bid) throws Exception{

		bookService.deleteBookById(bid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/bookdelete_submit")
	public @ResponseBody SubmitResultInfo bookdelete_submit(BookQueryVo bookQueryVo,int[] indexs) throws Exception{
		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String bid=bookQueryVo.getBookCustoms().get(indexs[i]).getBid();
			try {
				bookService.deleteBookById(bid);
			} catch (Exception e) {
				e.printStackTrace();
				
				if(e instanceof ExceptionResultInfo){
					resultInfo=((ExceptionResultInfo) e).getResultInfo();
				}else{
					resultInfo=ResultUtil.createFail(Config.MESSAGE,900,null);

				}
				
			}
			
			if(resultInfo==null){
				count_success++;
			}else{
				
				count_error++;
				
				msgs_error.add(resultInfo);
			}
		}
			
		
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,907, new Object[]{count_success,count_error}),msgs_error);
	}
	
	
	
	@RequestMapping("/analysisbookinfo")
	public String analysisbookinfo(Model model)throws Exception{
		
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		
		model.addAttribute("smwc_info", smwc_info);
		
		model.addAttribute("shzt_info", shzt_info);
		
		return "/book/analysisbookinfo";
	}
	
	@RequestMapping("/analysisbookinfo_submit")
	public @ResponseBody ChartsDataSourceResult analysisbookinfo_submit(BookQueryVo bookQueryVo) throws Exception{
		
		ChartsDataSourceResult cdsr=new ChartsDataSourceResult();
		
		Chart chart=new Chart();
		
		List<CharData> datas=new ArrayList<>();
		
		List<Map> list=bookService.analysisBookInfo(bookQueryVo);
	
		CharData data1=null;
		
		for(Map map:list){
			
			String lable= map.get("lable")+"";
			String data =map.get("data")+"";
			
			data1=new CharData();
			data1.setLabel(lable);
			data1.setValue(data);
			
			datas.add(data1);
		}
		
	
		
		chart.setCaption("教师項目信息统计图表");
		
		
		
		chart.setyAxisName("人数");
		
		cdsr.setChart(chart);
		
		cdsr.setData(datas);
		
		return cdsr;
	}
	
	@RequestMapping("/checkbh")
	public @ResponseBody Teacher checkbh(String bh) throws Exception{

		Teacher tea=teacherService.getTeacherBybh(bh);
		
		if(tea==null){
			return null;
		}
		
		return tea;
	}
	
	
}

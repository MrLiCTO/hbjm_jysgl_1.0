package com.shilong.jysgl.action.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Dicttype;
import com.shilong.jysgl.pojo.vo.TeacherQueryVo;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.DataGridResultInfo;
import com.shilong.jysgl.process.result.PageQuery;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.DictInfoService;
@RequestMapping("/dictinfo")
@Controller
public class DictInfoAction {
	@Resource
	private DictInfoService dictInfoService;
	
	
	@RequestMapping("/dicttypelist")
	public String dicttypelist(){
		return "/dict/dicttypelist";
	}
	
	@RequestMapping("/dicttypelist_result")
	public @ResponseBody DataGridResultInfo dicttypelist_result(Model model) throws Exception{
		
		List<Dicttype> dictTypeList = dictInfoService.findDictTypeList();
		
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		
		resultInfo.setRows(dictTypeList);
		
		return resultInfo;
	}
	
	@RequestMapping("/dictinfolist")
	public String dictinfolist(Model model,String typecode){
		model.addAttribute("typecode",typecode);
		return "/dict/dictinfolist";
	}
	
	@RequestMapping("/dictinfolist_result")
	public @ResponseBody DataGridResultInfo dictinfolist_result(Model model,String typecode) throws Exception{
		
	    List<Dictinfo> dictInfoList = dictInfoService.findDictInfoList(typecode);
		
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		
		resultInfo.setRows(dictInfoList);
		
		return resultInfo;
	}
	
	
	@RequestMapping("/adddictinfo")
	public String addteacher(Model model,String typecode) throws Exception{

		model.addAttribute("typecode", typecode);
		
		return "/dict/adddictinfo";
	}
	
	@RequestMapping("/adddictinfo_submit")
	public @ResponseBody DataGridResultInfo adddictinfo_submit(String typecode,String dictinfo) throws Exception{

		dictInfoService.insertDictInfo(dictinfo, typecode);
		
		return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/editdictinfo")
	public String editdictinfo(Model model,String dictcode) throws Exception{
		
		Dictinfo dictinfo = dictInfoService.getDictInfoById(dictcode);

		model.addAttribute("dictinfo", dictinfo);
		
		return "/dict/editdictinfo";
	}
	
	@RequestMapping("/editdictinfo_submit")
	public @ResponseBody DataGridResultInfo editdictinfo_submit(String dictcode,String dictinfo) throws Exception{

		dictInfoService.updateDictInfo(dictcode, dictinfo);
		
		return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/deletedictinfo")
	public @ResponseBody DataGridResultInfo deletedictinfo(String dictcode) throws Exception{

		dictInfoService.deleteDictInfoById(dictcode);
		
		return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
}

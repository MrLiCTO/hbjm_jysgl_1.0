package com.shilong.jysgl.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.BookMapper;
import com.shilong.jysgl.dao.culture.mapper.DictinfoMapper;
import com.shilong.jysgl.dao.culture.mapper.TeaBookMapper;
import com.shilong.jysgl.dao.culture.mapper.TeacherMapper;
import com.shilong.jysgl.dao.custom.mapper.BookMapperCustom;
import com.shilong.jysgl.pojo.po.Book;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.TeaBook;
import com.shilong.jysgl.pojo.po.TeaBookExample;
import com.shilong.jysgl.pojo.po.TeaBookKey;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.BookCustom;
import com.shilong.jysgl.pojo.vo.BookQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.BookService;
import com.shilong.jysgl.utils.UUIDBuild;

public class BookServiceImpl implements BookService {

	@Resource
	private BookMapper bookMapper;
	@Resource
	private BookMapperCustom bookMapperCustom;
	@Resource
	private TeacherMapper teacherMapper;
	@Resource
	private TeaBookMapper teaBookMapper;
	@Resource
	private DictinfoMapper dictinfoMapper;
	
	@Override
	public void insertBook(BookQueryVo bookQueryVo, int[] indexs) throws Exception {
		if(bookQueryVo==null||bookQueryVo.getBookCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		BookCustom bookCustom = bookQueryVo.getBookCustom();
		
		Book book=new Book();
		
		book.setBid(UUIDBuild.getUUID());
		
		book.setCbs(bookCustom.getCbs());
		
		book.setCbsj(bookCustom.getCbsj());
		
		book.setShzt("sh000");
		
		book.setZzmc(bookCustom.getZzmc());
		
		bookMapper.insert(book);
		
		String bid = book.getBid();
		List<TeacherCustom> teacherCustoms = bookQueryVo.getTeacherCustoms();
		
		for(int i=0;i<indexs.length;i++){
			TeacherCustom teacherCustom = teacherCustoms.get(indexs[i]);
			
			if(teacherCustom==null
					||teacherCustom.getTeaid()==null
					||teacherCustom.getTeaid().equals("")
					||teacherCustom.getSmwc()==null
					||teacherCustom.getSmwc().equals("")){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			}
			
			TeaBook tb = new TeaBook();
			tb.setBid(bid);
			tb.setSmwc(teacherCustom.getSmwc());
			tb.setTeaid(teacherCustom.getTeaid());
			teaBookMapper.insert(tb);
			
		}
		
	}

	@Override
	public void updateBook(BookQueryVo bookQueryVo, int[] indexs, String bid) throws Exception {
		if(bookQueryVo==null||bookQueryVo.getBookCustom()==null||bookQueryVo.getTeacherCustoms()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		BookCustom bookCustom = bookQueryVo.getBookCustom();
		
		Book book=bookMapper.selectByPrimaryKey(bid);
		
		book.setCbs(bookCustom.getCbs());
		
		book.setCbsj(bookCustom.getCbsj());
		
		book.setZzmc(bookCustom.getZzmc());
		
		bookMapper.updateByPrimaryKey(book);
		
		TeaBookKey tk=new TeaBookKey();
		
		TeaBookExample tbe=new TeaBookExample();
		
		TeaBookExample.Criteria tbc=tbe.createCriteria();
		
		tbc.andBidEqualTo(bid);
		
		teaBookMapper.deleteByExample(tbe);
		
		List<TeacherCustom> teacherCustoms = bookQueryVo.getTeacherCustoms();
		
		for(int i=0;i<indexs.length;i++){
			TeacherCustom teacherCustom = teacherCustoms.get(indexs[i]);
			
			if(teacherCustom==null
					||teacherCustom.getTeaid()==null
					||teacherCustom.getTeaid().equals("")
					||teacherCustom.getSmwc()==null
					||teacherCustom.getSmwc().equals("")){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			}
			
			TeaBook tb = new TeaBook();
			tb.setBid(bid);
			tb.setSmwc(teacherCustom.getSmwc());
			tb.setTeaid(teacherCustom.getTeaid());
			teaBookMapper.insert(tb);
			
		}
		
		
	}

	@Override
	public Book getBookById(String bid) throws Exception {
		
		return bookMapper.selectByPrimaryKey(bid);
	}

	@Override
	public void deleteBookById(String bid) throws Exception {
		
		TeaBookExample tbe=new TeaBookExample();
		
		TeaBookExample.Criteria tbc=tbe.createCriteria();
		
		tbc.andBidEqualTo(bid);

		teaBookMapper.deleteByExample(tbe);
		
		bookMapper.deleteByPrimaryKey(bid);
	}

	@Override
	public List<TeacherCustom> getTeasBybId(String bid) {
		
		TeaBookExample tbe=new TeaBookExample();
		
		TeaBookExample.Criteria tbc=tbe.createCriteria();
		
		tbc.andBidEqualTo(bid);
		
		List<TeaBook> list = teaBookMapper.selectByExample(tbe);
		
		List<TeacherCustom> teachers=new ArrayList<TeacherCustom>();
		
		if(list!=null){
			for(int i=0;i<list.size();i++){
				TeaBook teaBook = list.get(i);
				TeacherCustom tea=new TeacherCustom();
				
				Teacher tea_=teacherMapper.selectByPrimaryKey(teaBook.getTeaid());
				
				BeanUtils.copyProperties(tea_, tea); 
				
				Dictinfo dictinfo = dictinfoMapper.selectByPrimaryKey(teaBook.getSmwc());
				
				tea.setSmwcmc(dictinfo.getDictinfo());
				
				tea.setSmwc(teaBook.getSmwc());
				
				teachers.add(tea);
				
			}
		}
		
		return teachers;
	}

	@Override
	public List<BookCustom> findBookList(BookQueryVo bookQueryVo) {
		List<BookCustom> bookList = bookMapperCustom.findBookList(bookQueryVo);
	
		if(bookList!=null){
			for(int i=0;i<bookList.size();i++){
				BookCustom bookCustom = bookList.get(i);
				
				List<TeacherCustom> teas = this.getTeasBybId(bookCustom.getBid());
				
				bookCustom.setTeachers(teas);
			}
		}
		
		return bookList;
	}

	@Override
	public int findBookCount(BookQueryVo bookQueryVo) {
	
		return bookMapperCustom.findBookCount(bookQueryVo);
	}

	@Override
	public List<Map> analysisBookInfo(BookQueryVo bookQueryVo) {
		List<Map> list=null;
		if(bookQueryVo.getBookCustom()!=null){
			BookCustom bookCustom = bookQueryVo.getBookCustom();
			
			String grp_by = bookCustom.getGrp_by();
			
			if(grp_by.endsWith("smwc_gr")){
				list=bookMapperCustom.analysisBookSmwcInfo(bookQueryVo);
			}else{
				list=bookMapperCustom.analysisBookYearInfo(bookQueryVo);
			}
		}
		
		return list;
	}

}

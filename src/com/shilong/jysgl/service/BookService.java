package com.shilong.jysgl.service;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.po.Book;
import com.shilong.jysgl.pojo.vo.BookCustom;
import com.shilong.jysgl.pojo.vo.BookQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;

public interface BookService {
	public void insertBook(BookQueryVo bookQueryVo,int[] indexs) throws Exception;//添加著作信息
	public void updateBook(BookQueryVo bookQueryVo,int[] indexs,String bid) throws Exception;//修改著作信息
	
	public Book getBookById(String bid) throws Exception;//根据id查询著作信息
	public void deleteBookById(String bid) throws Exception;//根据id删除著作信息
	
	public List<TeacherCustom> getTeasBybId(String bid);
	
	public List<BookCustom> findBookList(BookQueryVo bookQueryVo);
	public int findBookCount(BookQueryVo bookQueryVo);
	
	public List<Map> analysisBookInfo(BookQueryVo bookQueryVo);
}

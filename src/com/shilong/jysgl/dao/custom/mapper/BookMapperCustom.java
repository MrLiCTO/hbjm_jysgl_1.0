package com.shilong.jysgl.dao.custom.mapper;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.vo.BookCustom;
import com.shilong.jysgl.pojo.vo.BookQueryVo;

public interface BookMapperCustom {
	public List<BookCustom> findBookList(BookQueryVo bookQueryVo);
	public int findBookCount(BookQueryVo bookQueryVo);
	
	public List<Map> analysisBookSmwcInfo(BookQueryVo bookQueryVo);
	public List<Map> analysisBookYearInfo(BookQueryVo bookQueryVo);
}

package com.shilong.jysgl.service;

import java.util.List;

import com.shilong.jysgl.pojo.po.Sourcefile;
import com.shilong.jysgl.pojo.vo.CourseQueryVo;
import com.shilong.jysgl.pojo.vo.SourceFileCustom;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月9日
 */
public interface SourceFileService {
	public void insertSourceFile(String teaid,CourseQueryVo courseQueryVo) throws Exception;//添加文件
	public void insertSourceFile(String cid,String teaid,CourseQueryVo courseQueryVo) throws Exception;//添加文件
	
	public void updateSourceFile(String sfid,CourseQueryVo courseQueryVo) throws Exception;//修改文件
	
	
	public List<SourceFileCustom> findSourceFileList(String cid,CourseQueryVo courseQueryVo) throws Exception;//文件列表
	public int findSourceFileCount(String cid,CourseQueryVo courseQueryVo) throws Exception;//文件列表
	
	public List<SourceFileCustom> findSourceFileList(CourseQueryVo courseQueryVo) throws Exception;//文件列表
	public int findSourceFileCount(CourseQueryVo courseQueryVo) throws Exception;//文件列表
	
	public Sourcefile getSourceFileById(String sfid) throws Exception;//根据id查询文件
	public void deleteSourceFileById(String sfid) throws Exception;//根据id删除文件
}

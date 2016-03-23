package com.shilong.jysgl.service;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.po.Project;
import com.shilong.jysgl.pojo.vo.ProjectCustom;
import com.shilong.jysgl.pojo.vo.ProjectQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;

public interface ProjectService {
	
	public void insertProject(ProjectQueryVo protectQueryVo,int[] indexs) throws Exception;//添加项目信息
	public void updateProject(ProjectQueryVo protectQueryVo,int[] indexs,String prid) throws Exception;//修改项目信息
	
	public Project getProjectById(String prid) throws Exception;//根据id查询项目信息
	public void deleteProjectById(String prid) throws Exception;//根据id删除项目信息
	
	public List<TeacherCustom> getTeasByPrId(String prid);
	
	
	public List<ProjectCustom> findProjectList(ProjectQueryVo projectQueryVo);
	public int findProjectCount(ProjectQueryVo projectQueryVo);
	
	public List<Map> analysisProjectInfo(ProjectQueryVo projectQueryVo);
	public List<Map> analysisTeaProInfo(ProjectQueryVo projectQueryVo);
}

package com.shilong.jysgl.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.DictinfoMapper;
import com.shilong.jysgl.dao.culture.mapper.ProjectMapper;
import com.shilong.jysgl.dao.culture.mapper.TeaProjectMapper;
import com.shilong.jysgl.dao.culture.mapper.TeacherMapper;
import com.shilong.jysgl.dao.custom.mapper.ProjectMapperCustom;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Project;
import com.shilong.jysgl.pojo.po.TeaProject;
import com.shilong.jysgl.pojo.po.TeaProjectExample;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.po.TeacherExample;
import com.shilong.jysgl.pojo.vo.ProjectCustom;
import com.shilong.jysgl.pojo.vo.ProjectQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.ProjectService;
import com.shilong.jysgl.utils.UUIDBuild;

public class ProjectServiceImpl implements ProjectService {

	@Resource
	private ProjectMapper projectMapper;
	@Resource
	private ProjectMapperCustom projectMapperCustom;
	@Resource
	private TeaProjectMapper teaProjectMapper;
	@Resource
	private TeacherMapper teacherMapper;
	@Resource
	private DictinfoMapper dictinfoMapper;

	@Override
	public void insertProject(ProjectQueryVo protectQueryVo,int[] indexs) throws Exception {
		if (protectQueryVo == null || protectQueryVo.getProjectCustom() == null
				|| protectQueryVo.getTeacherCustoms() == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}

		ProjectCustom projectCustom = protectQueryVo.getProjectCustom();

		List<TeacherCustom> teacherCustoms = protectQueryVo.getTeacherCustoms();

		Project pro = new Project();

		BeanUtils.copyProperties(projectCustom, pro);

		pro.setPrid(UUIDBuild.getUUID());
		
		pro.setShzt("sh000");

		projectMapper.insert(pro);

		String prid = pro.getPrid();
		
		
		for(int i=0;i<indexs.length;i++){
			TeacherCustom teacherCustom = teacherCustoms.get(indexs[i]);
			
			if(teacherCustom==null
					||teacherCustom.getTeaid()==null
					||teacherCustom.getTeaid().equals("")
					||teacherCustom.getSmwc()==null
					||teacherCustom.getSmwc().equals("")){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			}
			
			TeaProject tp = new TeaProject();
			tp.setPrid(prid);
			tp.setSmwc(teacherCustom.getSmwc());
			tp.setTeaid(teacherCustom.getTeaid());
			teaProjectMapper.insert(tp);
			
		}
		

		/*for (int i = 0; i < teacherCustoms.size(); i++) {
			String smwc = teacherCustoms.get(i).getSmwc();
			String bh = teacherCustoms.get(i).getBh();

			TeacherExample te = new TeacherExample();

			TeacherExample.Criteria tec = te.createCriteria();

			tec.andBhEqualTo(bh);

			List<Teacher> list = teacherMapper.selectByExample(te);

			if (list == null || list.size() != 1) {
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			}
			String teaid = list.get(0).getTeaid();
			TeaProject tp = new TeaProject();
			tp.setPrid(prid);
			tp.setSmwc(smwc);
			tp.setTeaid(teaid);
			teaProjectMapper.insert(tp);
		}*/

	}

	@Override
	public void updateProject(ProjectQueryVo projectQueryVo,int[] indexs, String prid) throws Exception {
		if (projectQueryVo == null || projectQueryVo.getProjectCustom() == null
				|| projectQueryVo.getTeacherCustoms() == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}

		TeaProjectExample tp = new TeaProjectExample();

		TeaProjectExample.Criteria tc = tp.createCriteria();

		tc.andPridEqualTo(prid);

		teaProjectMapper.deleteByExample(tp);

		ProjectCustom projectCustom = projectQueryVo.getProjectCustom();

		List<TeacherCustom> teacherCustoms = projectQueryVo.getTeacherCustoms();

		Project pro = projectMapper.selectByPrimaryKey(prid);
		
		pro.setFj(projectCustom.getFj());
		
		pro.setJxsj(projectCustom.getJxsj());
		
		pro.setLxsj(projectCustom.getLxsj());
		
		pro.setPzdw(projectCustom.getPzdw());
		
		pro.setXmbh(projectCustom.getXmbh());
		
		pro.setXmjb(projectCustom.getXmjb());
		
		pro.setXmlx(projectCustom.getXmlx());
		
		pro.setXmmc(projectCustom.getXmmc());
		
		projectMapper.updateByPrimaryKey(pro);
		
		prid = pro.getPrid();

		for(int i=0;i<indexs.length;i++){
			TeacherCustom teacherCustom = teacherCustoms.get(indexs[i]);
			
			if(teacherCustom==null
					||teacherCustom.getTeaid()==null
					||teacherCustom.getTeaid().equals("")
					||teacherCustom.getSmwc()==null
					||teacherCustom.getSmwc().equals("")){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			}
			
			TeaProject tp_ = new TeaProject();
			tp_.setPrid(prid);
			tp_.setSmwc(teacherCustom.getSmwc());
			tp_.setTeaid(teacherCustom.getTeaid());
			teaProjectMapper.insert(tp_);
			
		}

	}

	@Override
	public Project getProjectById(String prid) throws Exception {
		
		return projectMapper.selectByPrimaryKey(prid);
	}

	@Override
	public void deleteProjectById(String id) throws Exception {
		
		TeaProjectExample tp = new TeaProjectExample();

		TeaProjectExample.Criteria tc = tp.createCriteria();

		tc.andPridEqualTo(id);

		teaProjectMapper.deleteByExample(tp);
		
		projectMapper.deleteByPrimaryKey(id);

	}

	@Override
	public List<ProjectCustom> findProjectList(ProjectQueryVo projectQueryVo) {

		List<ProjectCustom> projectList = projectMapperCustom.findProjectList(projectQueryVo);

		TeacherCustom tea = null;
		List<TeacherCustom> teas = null;
		if (projectList != null) {
			for (int i = 0; i < projectList.size(); i++) {
				ProjectCustom projectCustom = projectList.get(i);

				String prid = projectCustom.getPrid();

				TeaProjectExample tpe = new TeaProjectExample();

				TeaProjectExample.Criteria tc = tpe.createCriteria();

				tc.andPridEqualTo(prid);

				List<TeaProject> list = teaProjectMapper.selectByExample(tpe);

				if (list != null) {
					teas = new ArrayList<TeacherCustom>();
					for (int j = 0; j < list.size(); j++) {
						String smwc = list.get(j).getSmwc();
						String teaid = list.get(j).getTeaid();

						Teacher tea_ = teacherMapper.selectByPrimaryKey(teaid);
						tea = new TeacherCustom();
						BeanUtils.copyProperties(tea_, tea);

						tea.setSmwc(smwc);

						Dictinfo dictinfo = dictinfoMapper.selectByPrimaryKey(smwc);

						tea.setSmwcmc(dictinfo.getDictinfo());

						teas.add(tea);

					}
				}
				projectCustom.setTeachers(teas);
			}
		}

		return projectList;
	}

	@Override
	public int findProjectCount(ProjectQueryVo projectQueryVo) {

		return projectMapperCustom.findProjectCount(projectQueryVo);
	}

	@Override
	public List<TeacherCustom> getTeasByPrId(String prid) {
		TeaProjectExample tpe = new TeaProjectExample();

		TeaProjectExample.Criteria tc = tpe.createCriteria();

		tc.andPridEqualTo(prid);

		List<TeaProject> list = teaProjectMapper.selectByExample(tpe);
		List<TeacherCustom> teas = null;
		TeacherCustom tea = null;
		if (list != null) {
			teas = new ArrayList<TeacherCustom>();
			for (int j = 0; j < list.size(); j++) {
				String smwc = list.get(j).getSmwc();
				String teaid = list.get(j).getTeaid();

				Teacher tea_ = teacherMapper.selectByPrimaryKey(teaid);
				tea = new TeacherCustom();
				BeanUtils.copyProperties(tea_, tea);

				tea.setSmwc(smwc);

				Dictinfo dictinfo = dictinfoMapper.selectByPrimaryKey(smwc);

				tea.setSmwcmc(dictinfo.getDictinfo());

				teas.add(tea);

			}
		}
		
		return teas;
	}

	@Override
	public List<Map> analysisProjectInfo(ProjectQueryVo projectQueryVo) {
		
		if(projectQueryVo==null){
			projectQueryVo=new ProjectQueryVo();
			
		}
		if(projectQueryVo.getProjectCustom()==null){
			ProjectCustom projectCustom=new ProjectCustom();
			
			projectCustom.setGrp_by("xmjb_gr");
		}
		
		
		return projectMapperCustom.analysisProjectInfo(projectQueryVo);
	}

	@Override
	public List<Map> analysisTeaProInfo(ProjectQueryVo projectQueryVo) {
		return projectMapperCustom.analysisTeaProInfo(projectQueryVo);
	}

}

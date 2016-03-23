package com.shilong.jysgl.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.DictinfoMapper;
import com.shilong.jysgl.dao.culture.mapper.PaperMapper;
import com.shilong.jysgl.dao.culture.mapper.TeaPapersMapper;
import com.shilong.jysgl.dao.culture.mapper.TeacherMapper;
import com.shilong.jysgl.dao.custom.mapper.PaperMapperCustom;
import com.shilong.jysgl.pojo.po.Paper;
import com.shilong.jysgl.pojo.po.TeaPapers;
import com.shilong.jysgl.pojo.po.TeaPapersExample;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.PaperCustom;
import com.shilong.jysgl.pojo.vo.PaperQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ExceptionResultInfo;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.PaperService;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年11月18日
 */
public class PaperServiceImpl implements PaperService {

	@Resource
	private TeaPapersMapper teaPapersMapper;
	
	@Resource
	private TeacherMapper teacherMapper;
	
	@Resource
	private PaperMapper paperMapper;
	
	@Resource
	private PaperMapperCustom paperMapperCustom;
	
	@Resource
	private DictinfoMapper dictinfoMapper;

	@Override
	public void insertPaper(PaperQueryVo paperQueryVo, int[] indexs) throws Exception {
		if(paperQueryVo==null||paperQueryVo.getPaperCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		 PaperCustom paperCustom = paperQueryVo.getPaperCustom();
		
		Paper paper=new Paper();
		
		paper.setPaid(UUIDBuild.getUUID());
		
		paper.setLwtm(paperCustom.getLwtm());
		
		paper.setFbqkmc(paperCustom.getFbqkmc());
		
		paper.setFbsj(paperCustom.getFbsj());
		
		paper.setLwdc(paperCustom.getLwdc());
		
		paper.setLwlb(paperCustom.getLwlb());
		
		paper.setShzt("sh000");//默认不通过
		
		paper.setJszk(paperCustom.getJszk());
		
		paper.setFj(paperCustom.getFj());
		
		paperMapper.insert(paper);
		
		String paid = paper.getPaid();
		List<TeacherCustom> teacherCustoms = paperQueryVo.getTeacherCustoms();
		
		for(int i=0;i<indexs.length;i++){
			TeacherCustom teacherCustom = teacherCustoms.get(indexs[i]);
			
			if(teacherCustom==null
					||teacherCustom.getTeaid()==null
					||teacherCustom.getTeaid().equals("")
					||teacherCustom.getSmwc()==null
					||teacherCustom.getSmwc().equals("")){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			}
			
			TeaPapers tp = new TeaPapers();
			tp.setPaid(paid);
			tp.setSmwc(teacherCustom.getSmwc());
			tp.setTeaid(teacherCustom.getTeaid());
			teaPapersMapper.insert(tp);
			
		}
		

	}

	@Override
	public void updatePaper(PaperQueryVo paperQueryVo, int[] indexs, String pid) throws Exception {
		if(paperQueryVo==null||paperQueryVo.getPaperCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		 PaperCustom paperCustom = paperQueryVo.getPaperCustom();
		
		Paper paper=paperMapper.selectByPrimaryKey(pid);	
		
		paper.setLwtm(paperCustom.getLwtm());
		
		paper.setFbqkmc(paperCustom.getFbqkmc());
		
		paper.setFbsj(paperCustom.getFbsj());
		
		paper.setLwdc(paperCustom.getLwdc());	
		
		paper.setLwlb(paperCustom.getLwlb());
		
		paper.setJszk(paperCustom.getJszk());
		
		paper.setFj(paperCustom.getFj());
		
		paperMapper.updateByPrimaryKey(paper);
		
		
		TeaPapersExample tpe=new TeaPapersExample();
		
		TeaPapersExample.Criteria  tec = tpe.createCriteria();
		
		tec.andPaidEqualTo(pid);
		
		teaPapersMapper.deleteByExample(tpe);
		
		
		List<TeacherCustom> teacherCustoms = paperQueryVo.getTeacherCustoms();
		
		for(int i=0;i<indexs.length;i++){
			TeacherCustom teacherCustom = teacherCustoms.get(indexs[i]);
			
			if(teacherCustom==null
					||teacherCustom.getTeaid()==null
					||teacherCustom.getTeaid().equals("")
					||teacherCustom.getSmwc()==null
					||teacherCustom.getSmwc().equals("")){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			}
			
			TeaPapers tp = new TeaPapers();
			tp.setPaid(pid);
			tp.setSmwc(teacherCustom.getSmwc());
			tp.setTeaid(teacherCustom.getTeaid());
			teaPapersMapper.insert(tp);
			
		}

	}


	@Override
	public Paper getPaperById(String pid) throws Exception {
		
		return paperMapper.selectByPrimaryKey(pid);
	}


	@Override
	public void deletePaperById(String pid) throws Exception {
		TeaPapersExample tpe=new TeaPapersExample();
		
		TeaPapersExample.Criteria  tec = tpe.createCriteria();
		
		tec.andPaidEqualTo(pid);
		
		teaPapersMapper.deleteByExample(tpe);
		
		paperMapper.deleteByPrimaryKey(pid);
		

	}

	
	@Override
	public List<TeacherCustom> getTeasBybId(String pid) {
		TeaPapersExample tpe=new TeaPapersExample();
		
		TeaPapersExample.Criteria  tec = tpe.createCriteria();
		
		tec.andPaidEqualTo(pid);
		
		List<TeaPapers> list = teaPapersMapper.selectByExample(tpe);
		
		List<TeacherCustom> teacherCustom=new ArrayList<TeacherCustom>();
		
		if(list!=null){
			for(int i=0;i<list.size();i++){
				TeaPapers teaPapers = list.get(i);
				
				String teaid = teaPapers.getTeaid();
				
				Teacher tea_=teacherMapper.selectByPrimaryKey(teaid);
				
				TeacherCustom tea=new TeacherCustom();
				
				BeanUtils.copyProperties(tea_, tea);
				
				tea.setSmwc(teaPapers.getSmwc());
				
				tea.setSmwcmc(dictinfoMapper.selectByPrimaryKey(teaPapers.getSmwc()).getDictinfo());
				
				teacherCustom.add(tea);
			}
		}
		
		return teacherCustom;
	}

	
	@Override
	public List<PaperCustom> findPaperList(PaperQueryVo paperQueryVo) {
		
		List<PaperCustom> list = paperMapperCustom.findPaperList(paperQueryVo);
		
		if(list!=null){
			for(int i=0;i<list.size();i++){
				PaperCustom paperCustom = list.get(i);
				String paid = paperCustom.getPaid();
				List<TeacherCustom> teas = this.getTeasBybId(paid);
				
				
				paperCustom.setTeachers(teas);
				
				 
			}
		}
		
		return list;
	}

	
	@Override
	public int findPaperCount(PaperQueryVo paperQueryVo) {

		return paperMapperCustom.findPaperCount(paperQueryVo);
	}

	
	@Override
	public List<Map> analysisPaperInfo(PaperQueryVo paperQueryVo) throws Exception{
		
		if(paperQueryVo==null){
			
			paperQueryVo=new PaperQueryVo();
		}
		
		PaperCustom paperCustom = paperQueryVo.getPaperCustom();
		
		if(paperCustom==null){
			paperCustom=new PaperCustom();
		}
		
		if(paperCustom.getGrp_by()==null||paperCustom.getGrp_by().equals("")){
			
			paperCustom.setGrp_by("lwdc_gr");
		}
		
		paperQueryVo.setPaperCustom(paperCustom);
		
		if(paperQueryVo.getPaperCustom().getGrp_by().equals("smwc_gr")){
			return paperMapperCustom.analysisPaperTeaInfo(paperQueryVo);
		}else{
			return paperMapperCustom.analysisPaperInfo(paperQueryVo);
		}
		
	}

}

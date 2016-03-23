package com.shilong.jysgl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.shilong.jysgl.dao.culture.mapper.CourseMapper;
import com.shilong.jysgl.dao.culture.mapper.DictinfoMapper;
import com.shilong.jysgl.pojo.po.Course;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.DictinfoExample;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.utils.HxlsOptRowsInterface;
import com.shilong.jysgl.utils.UUIDBuild;
@Resource
public class ImportCouExcelServiceImpl implements HxlsOptRowsInterface{

	@Resource
	private CourseMapper courceMapper;
	
	@Resource
	private DictinfoMapper dictinfoMapper;
	
	
	@Override
	public String optRows(int sheetIndex, int curRow, List<String> rowlist) throws Exception {
		
		try {
			String kcmc = rowlist.get(0);
			String kch = rowlist.get(1);
			String lbmc = rowlist.get(2);
			String xf = rowlist.get(3);
			String llks = rowlist.get(4);
			String sjks = rowlist.get(5);
			String kkxq = rowlist.get(6);
			String sfsjpk = rowlist.get(7);
			String jpkjbmc = rowlist.get(8);
			String sfsywlkt = rowlist.get(9);
			String lb=null;
			if(lbmc!=null&&!lbmc.equals("")){
				 lb= this.findDictinfoByInfo(lbmc).getDictcode();
				if(lb==null){
					return "类别名称输入不正确，请检查";
				}
			}
			
			
			String jpkjb=null;
			if(sfsjpk!=null&&sfsjpk.equals("1")&&jpkjbmc!=null&&!jpkjbmc.equals("")){
				jpkjb=this.findDictinfoByInfo(jpkjbmc).getDictcode();
				
				if(jpkjb==null || jpkjb.equals("")){
					return "精品课输入不正确，请检查";
				}
			}else{
				sfsjpk="0";
				jpkjb=null;
			}
			
			if(sfsywlkt==null || sfsywlkt.equals("")){
				sfsywlkt="0";
			}
			
			if(kkxq!=null && !kkxq.equals("0") && !kkxq.equals("1")){
				kkxq=null;
			}
			
			
			Course cou=new Course();
			
			cou.setCid(UUIDBuild.getUUID());
			
			cou.setJpkjb(jpkjb);
			
			cou.setKch(kch);
			
			cou.setKcmc(kcmc);
			
			if(kkxq==null){
				kkxq="4";
			}
			
			cou.setKkxq(kkxq);
			
			cou.setLb(lb);
			
			try {
				cou.setLlks(Integer.parseInt(llks));
				
				cou.setSjks(Integer.parseInt(sjks));
				
				cou.setXf(Float.parseFloat(xf));
				
				cou.setZks(Integer.parseInt(llks)+Integer.parseInt(sjks));
			} catch (NumberFormatException e) {
				
				return "课时，学分，请输入数字";
			}
			
			if(sfsywlkt!=null&&sfsywlkt.equals("是")){
				sfsywlkt="1";
			}else{
				sfsywlkt="0";
			}
			
			cou.setSfsjpk(sfsjpk);
			
			cou.setSfsywlkt(sfsywlkt);
			
			
			
			courceMapper.insert(cou);
			
		} catch (Exception e) {
			e.printStackTrace();
			return "插入失败";
		}
		
		return "success";
	}
	
	public Dictinfo findDictinfoByInfo(String dictinfo) throws Exception{
		DictinfoExample de=new DictinfoExample();
		
		DictinfoExample.Criteria dc=de.createCriteria();
		
		dc.andDictinfoEqualTo(dictinfo);
		
		List<Dictinfo> list=dictinfoMapper.selectByExample(de);
		
		if(list==null||list.size()!=1){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,903,null));
		}
		return list.get(0);
	}

}

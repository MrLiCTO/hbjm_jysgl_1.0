package com.shilong.jysgl.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.shilong.jysgl.dao.culture.mapper.DictinfoMapper;
import com.shilong.jysgl.dao.culture.mapper.TeacherMapper;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.DictinfoExample;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.utils.HxlsOptRowsInterface;
import com.shilong.jysgl.utils.MD5;
import com.shilong.jysgl.utils.MyUtil;
import com.shilong.jysgl.utils.UUIDBuild;
@Resource
public class ImportTeaExcelServiceImpl implements HxlsOptRowsInterface{

	@Resource
	private TeacherMapper teacherMapper;
	
	@Resource
	private DictinfoMapper dictinfoMapper;
	
	@Override
	public String optRows(int sheetIndex, int curRow, List<String> rowlist) throws Exception {
		
		try {
			String bh=rowlist.get(0);
			String xm=rowlist.get(1);
			String js=rowlist.get(2);
			String xb=rowlist.get(3);
			String xy=rowlist.get(4);
			String csrq=rowlist.get(5);
			String yjfx=rowlist.get(6);
			String zzmm=rowlist.get(7);
			
			
			Teacher tea=new Teacher();
			
			js=this.findDictinfoByInfo(js).getDictcode();
			xb=this.findDictinfoByInfo(xb).getDictcode();
			xy=this.findDictinfoByInfo(xy).getDictcode();
			zzmm=this.findDictinfoByInfo(zzmm).getDictcode();
			
			Date csrq_=MyUtil.getDate2(csrq);

			tea.setTeaid(UUIDBuild.getUUID());
			
			tea.setBh(bh);
			tea.setXm(xm);
			tea.setXb(xb);
			tea.setJs(js);
			tea.setXy(xy);
			tea.setCsrq(csrq_);
			tea.setYjfx(yjfx);
			tea.setZzmm(zzmm);
			tea.setMm(new MD5().getMD5ofStr("123456"));
			tea.setZzzt("zz001");//在职
			tea.setShzt("sh001");//默认通过
			
			teacherMapper.insert(tea);
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
		
		if(list==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,903,null));
		}
		return list.get(0);
	}

}

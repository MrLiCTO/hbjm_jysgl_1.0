package com.shilong.jysgl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.shilong.jysgl.dao.culture.mapper.DictinfoMapper;
import com.shilong.jysgl.dao.culture.mapper.DicttypeMapper;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.DictinfoExample;
import com.shilong.jysgl.pojo.po.Dicttype;
import com.shilong.jysgl.pojo.po.DicttypeExample;
import com.shilong.jysgl.service.DictInfoService;
import com.shilong.jysgl.utils.UUIDBuild;

public class DictInfoServiceImpl implements DictInfoService {
	@Resource
	private DictinfoMapper dictinfoMapper;
	@Resource
	private DicttypeMapper dicttypeMapper;
	
	@Override
	public void insertDictInfo(String dictInfo,String typecode) throws Exception {

		Dictinfo dic=new Dictinfo();
		
		dic.setDictcode(UUIDBuild.getUUID());
		
		dic.setDictinfo(dictInfo);
		
		dic.setTypecode(typecode);
		
		dic.setIsenable("1");//启用
		
		dictinfoMapper.insert(dic);
	}

	@Override
	public void updateDictInfo(String dictcode, String dictInfo) throws Exception {
		
		Dictinfo dic=dictinfoMapper.selectByPrimaryKey(dictcode);
		
		dic.setDictinfo(dictInfo);
		
		dictinfoMapper.updateByPrimaryKey(dic);

	}

	@Override
	public List<Dictinfo> findDictInfoList(String typeCode) throws Exception {
		
		DictinfoExample de=new DictinfoExample();
	
		DictinfoExample.Criteria dc=de.createCriteria();
		
		dc.andTypecodeEqualTo(typeCode);
	
		return dictinfoMapper.selectByExample(de);
	}

	@Override
	public Dictinfo getDictInfoById(String dictcode) throws Exception {
	
		return dictinfoMapper.selectByPrimaryKey(dictcode);
	}

	@Override
	public void deleteDictInfoById(String dictcode) throws Exception {
		dictinfoMapper.deleteByPrimaryKey(dictcode);

	}

	@Override
	public List<Dicttype> findDictTypeList() throws Exception {
		return dicttypeMapper.selectByExample(new DicttypeExample());
	}

}

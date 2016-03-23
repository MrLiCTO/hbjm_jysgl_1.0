package com.shilong.jysgl.service;

import java.util.List;

import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Dicttype;

public interface DictInfoService {
	public void insertDictInfo(String dictInfo,String typecode) throws Exception;//添加字典名称
	public void updateDictInfo(String dictcode,String dictInfo) throws Exception;//修改字典名称
	public List<Dictinfo> findDictInfoList(String typeCode) throws Exception;//字典名称列表
	public List<Dicttype> findDictTypeList() throws Exception;//字典类型列表
	public Dictinfo getDictInfoById(String dictcode) throws Exception;//根据字典代码查询字典名称
	public void deleteDictInfoById(String dictcode) throws Exception;//根据字典代码删除字典名称
}

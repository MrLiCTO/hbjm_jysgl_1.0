package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.DictinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictinfoMapper {
    int countByExample(DictinfoExample example);

    int deleteByExample(DictinfoExample example);

    int deleteByPrimaryKey(String dictcode);

    int insert(Dictinfo record);

    int insertSelective(Dictinfo record);

    List<Dictinfo> selectByExample(DictinfoExample example);

    Dictinfo selectByPrimaryKey(String dictcode);

    int updateByExampleSelective(@Param("record") Dictinfo record, @Param("example") DictinfoExample example);

    int updateByExample(@Param("record") Dictinfo record, @Param("example") DictinfoExample example);

    int updateByPrimaryKeySelective(Dictinfo record);

    int updateByPrimaryKey(Dictinfo record);
}
package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.CouGr;
import com.shilong.jysgl.pojo.po.CouGrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouGrMapper {
    int countByExample(CouGrExample example);

    int deleteByExample(CouGrExample example);

    int insert(CouGr record);

    int insertSelective(CouGr record);

    List<CouGr> selectByExample(CouGrExample example);

    int updateByExampleSelective(@Param("record") CouGr record, @Param("example") CouGrExample example);

    int updateByExample(@Param("record") CouGr record, @Param("example") CouGrExample example);
}
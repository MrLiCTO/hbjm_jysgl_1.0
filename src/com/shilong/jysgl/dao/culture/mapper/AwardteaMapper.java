package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.Awardtea;
import com.shilong.jysgl.pojo.po.AwardteaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardteaMapper {
    int countByExample(AwardteaExample example);

    int deleteByExample(AwardteaExample example);

    int deleteByPrimaryKey(String taid);

    int insert(Awardtea record);

    int insertSelective(Awardtea record);

    List<Awardtea> selectByExample(AwardteaExample example);

    Awardtea selectByPrimaryKey(String taid);

    int updateByExampleSelective(@Param("record") Awardtea record, @Param("example") AwardteaExample example);

    int updateByExample(@Param("record") Awardtea record, @Param("example") AwardteaExample example);

    int updateByPrimaryKeySelective(Awardtea record);

    int updateByPrimaryKey(Awardtea record);
}
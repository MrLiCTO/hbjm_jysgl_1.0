package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.TeaCouExample;
import com.shilong.jysgl.pojo.po.TeaCouKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaCouMapper {
    int countByExample(TeaCouExample example);

    int deleteByExample(TeaCouExample example);

    int deleteByPrimaryKey(TeaCouKey key);

    int insert(TeaCouKey record);

    int insertSelective(TeaCouKey record);

    List<TeaCouKey> selectByExample(TeaCouExample example);

    int updateByExampleSelective(@Param("record") TeaCouKey record, @Param("example") TeaCouExample example);

    int updateByExample(@Param("record") TeaCouKey record, @Param("example") TeaCouExample example);
}
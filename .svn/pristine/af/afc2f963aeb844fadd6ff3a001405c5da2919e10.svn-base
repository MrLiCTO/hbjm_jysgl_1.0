package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.TeaGrExample;
import com.shilong.jysgl.pojo.po.TeaGrKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaGrMapper {
    int countByExample(TeaGrExample example);

    int deleteByExample(TeaGrExample example);

    int deleteByPrimaryKey(TeaGrKey key);

    int insert(TeaGrKey record);

    int insertSelective(TeaGrKey record);

    List<TeaGrKey> selectByExample(TeaGrExample example);

    int updateByExampleSelective(@Param("record") TeaGrKey record, @Param("example") TeaGrExample example);

    int updateByExample(@Param("record") TeaGrKey record, @Param("example") TeaGrExample example);
}
package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.TeaPapers;
import com.shilong.jysgl.pojo.po.TeaPapersExample;
import com.shilong.jysgl.pojo.po.TeaPapersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaPapersMapper {
    int countByExample(TeaPapersExample example);

    int deleteByExample(TeaPapersExample example);

    int deleteByPrimaryKey(TeaPapersKey key);

    int insert(TeaPapers record);

    int insertSelective(TeaPapers record);

    List<TeaPapers> selectByExample(TeaPapersExample example);

    TeaPapers selectByPrimaryKey(TeaPapersKey key);

    int updateByExampleSelective(@Param("record") TeaPapers record, @Param("example") TeaPapersExample example);

    int updateByExample(@Param("record") TeaPapers record, @Param("example") TeaPapersExample example);

    int updateByPrimaryKeySelective(TeaPapers record);

    int updateByPrimaryKey(TeaPapers record);
}
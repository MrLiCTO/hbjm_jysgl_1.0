package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.Sourcefile;
import com.shilong.jysgl.pojo.po.SourcefileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SourcefileMapper {
    int countByExample(SourcefileExample example);

    int deleteByExample(SourcefileExample example);

    int deleteByPrimaryKey(String sfid);

    int insert(Sourcefile record);

    int insertSelective(Sourcefile record);

    List<Sourcefile> selectByExample(SourcefileExample example);

    Sourcefile selectByPrimaryKey(String sfid);

    int updateByExampleSelective(@Param("record") Sourcefile record, @Param("example") SourcefileExample example);

    int updateByExample(@Param("record") Sourcefile record, @Param("example") SourcefileExample example);

    int updateByPrimaryKeySelective(Sourcefile record);

    int updateByPrimaryKey(Sourcefile record);
}
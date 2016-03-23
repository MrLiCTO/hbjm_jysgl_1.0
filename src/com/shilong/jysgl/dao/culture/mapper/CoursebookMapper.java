package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.Coursebook;
import com.shilong.jysgl.pojo.po.CoursebookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursebookMapper {
    int countByExample(CoursebookExample example);

    int deleteByExample(CoursebookExample example);

    int deleteByPrimaryKey(String jcid);

    int insert(Coursebook record);

    int insertSelective(Coursebook record);

    List<Coursebook> selectByExample(CoursebookExample example);

    Coursebook selectByPrimaryKey(String jcid);

    int updateByExampleSelective(@Param("record") Coursebook record, @Param("example") CoursebookExample example);

    int updateByExample(@Param("record") Coursebook record, @Param("example") CoursebookExample example);

    int updateByPrimaryKeySelective(Coursebook record);

    int updateByPrimaryKey(Coursebook record);
}
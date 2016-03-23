package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.Coursegroup;
import com.shilong.jysgl.pojo.po.CoursegroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursegroupMapper {
    int countByExample(CoursegroupExample example);

    int deleteByExample(CoursegroupExample example);

    int deleteByPrimaryKey(String cgid);

    int insert(Coursegroup record);

    int insertSelective(Coursegroup record);

    List<Coursegroup> selectByExample(CoursegroupExample example);

    Coursegroup selectByPrimaryKey(String cgid);

    int updateByExampleSelective(@Param("record") Coursegroup record, @Param("example") CoursegroupExample example);

    int updateByExample(@Param("record") Coursegroup record, @Param("example") CoursegroupExample example);

    int updateByPrimaryKeySelective(Coursegroup record);

    int updateByPrimaryKey(Coursegroup record);
}
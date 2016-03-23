package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.TeaBook;
import com.shilong.jysgl.pojo.po.TeaBookExample;
import com.shilong.jysgl.pojo.po.TeaBookKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaBookMapper {
    int countByExample(TeaBookExample example);

    int deleteByExample(TeaBookExample example);

    int deleteByPrimaryKey(TeaBookKey key);

    int insert(TeaBook record);

    int insertSelective(TeaBook record);

    List<TeaBook> selectByExample(TeaBookExample example);

    TeaBook selectByPrimaryKey(TeaBookKey key);

    int updateByExampleSelective(@Param("record") TeaBook record, @Param("example") TeaBookExample example);

    int updateByExample(@Param("record") TeaBook record, @Param("example") TeaBookExample example);

    int updateByPrimaryKeySelective(TeaBook record);

    int updateByPrimaryKey(TeaBook record);
}
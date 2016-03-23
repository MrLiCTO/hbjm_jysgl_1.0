package com.shilong.jysgl.dao.culture.mapper;

import com.shilong.jysgl.pojo.po.TeaProject;
import com.shilong.jysgl.pojo.po.TeaProjectExample;
import com.shilong.jysgl.pojo.po.TeaProjectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaProjectMapper {
    int countByExample(TeaProjectExample example);

    int deleteByExample(TeaProjectExample example);

    int deleteByPrimaryKey(TeaProjectKey key);

    int insert(TeaProject record);

    int insertSelective(TeaProject record);

    List<TeaProject> selectByExample(TeaProjectExample example);

    TeaProject selectByPrimaryKey(TeaProjectKey key);

    int updateByExampleSelective(@Param("record") TeaProject record, @Param("example") TeaProjectExample example);

    int updateByExample(@Param("record") TeaProject record, @Param("example") TeaProjectExample example);

    int updateByPrimaryKeySelective(TeaProject record);

    int updateByPrimaryKey(TeaProject record);
}
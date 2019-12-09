package com.qm.mapper;

import com.qm.pojo.Warnlist;
import com.qm.pojo.WarnlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarnlistMapper {
    int countByExample(WarnlistExample example);

    int deleteByExample(WarnlistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Warnlist record);

    int insertSelective(Warnlist record);

    List<Warnlist> selectByExample(WarnlistExample example);

    Warnlist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Warnlist record, @Param("example") WarnlistExample example);

    int updateByExample(@Param("record") Warnlist record, @Param("example") WarnlistExample example);

    int updateByPrimaryKeySelective(Warnlist record);

    int updateByPrimaryKey(Warnlist record);
}
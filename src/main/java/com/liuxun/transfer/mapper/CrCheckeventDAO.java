package com.liuxun.transfer.mapper;

import com.liuxun.transfer.po.CrCheckevent;
import com.liuxun.transfer.po.CrCheckeventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrCheckeventDAO {
    long countByExample(CrCheckeventExample example);

    int deleteByExample(CrCheckeventExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrCheckevent record);

    int insertSelective(CrCheckevent record);

    List<CrCheckevent> selectByExample(CrCheckeventExample example);

    CrCheckevent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrCheckevent record, @Param("example") CrCheckeventExample example);

    int updateByExample(@Param("record") CrCheckevent record, @Param("example") CrCheckeventExample example);

    int updateByPrimaryKeySelective(CrCheckevent record);

    int updateByPrimaryKey(CrCheckevent record);
}
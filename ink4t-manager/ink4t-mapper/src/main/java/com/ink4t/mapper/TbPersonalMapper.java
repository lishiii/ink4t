package com.ink4t.mapper;

import com.ink4t.pojo.TbPersonal;
import com.ink4t.pojo.TbPersonalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPersonalMapper {
    int countByExample(TbPersonalExample example);

    int deleteByExample(TbPersonalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPersonal record);

    int insertSelective(TbPersonal record);

    List<TbPersonal> selectByExample(TbPersonalExample example);

    TbPersonal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPersonal record, @Param("example") TbPersonalExample example);

    int updateByExample(@Param("record") TbPersonal record, @Param("example") TbPersonalExample example);

    int updateByPrimaryKeySelective(TbPersonal record);

    int updateByPrimaryKey(TbPersonal record);
}
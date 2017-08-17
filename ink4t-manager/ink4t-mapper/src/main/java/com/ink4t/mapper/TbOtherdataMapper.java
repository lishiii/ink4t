package com.ink4t.mapper;

import com.ink4t.pojo.TbOtherdata;
import com.ink4t.pojo.TbOtherdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOtherdataMapper {
    int countByExample(TbOtherdataExample example);

    int deleteByExample(TbOtherdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOtherdata record);

    int insertSelective(TbOtherdata record);

    List<TbOtherdata> selectByExample(TbOtherdataExample example);

    TbOtherdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOtherdata record, @Param("example") TbOtherdataExample example);

    int updateByExample(@Param("record") TbOtherdata record, @Param("example") TbOtherdataExample example);

    int updateByPrimaryKeySelective(TbOtherdata record);

    int updateByPrimaryKey(TbOtherdata record);
}
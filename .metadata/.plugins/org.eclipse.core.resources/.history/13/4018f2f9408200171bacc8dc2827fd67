package com.ink4t.mapper;

import com.ink4t.pojo.Personal;
import com.ink4t.pojo.PersonalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalMapper {
    int countByExample(PersonalExample example);

    int deleteByExample(PersonalExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Personal record);

    int insertSelective(Personal record);

    List<Personal> selectByExample(PersonalExample example);

    Personal selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Personal record, @Param("example") PersonalExample example);

    int updateByExample(@Param("record") Personal record, @Param("example") PersonalExample example);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);
}
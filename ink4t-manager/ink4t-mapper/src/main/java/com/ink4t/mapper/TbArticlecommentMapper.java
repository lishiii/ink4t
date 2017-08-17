package com.ink4t.mapper;

import com.ink4t.pojo.TbArticlecomment;
import com.ink4t.pojo.TbArticlecommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbArticlecommentMapper {
    int countByExample(TbArticlecommentExample example);

    int deleteByExample(TbArticlecommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbArticlecomment record);

    int insertSelective(TbArticlecomment record);

    List<TbArticlecomment> selectByExample(TbArticlecommentExample example);

    TbArticlecomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbArticlecomment record, @Param("example") TbArticlecommentExample example);

    int updateByExample(@Param("record") TbArticlecomment record, @Param("example") TbArticlecommentExample example);

    int updateByPrimaryKeySelective(TbArticlecomment record);

    int updateByPrimaryKey(TbArticlecomment record);
}
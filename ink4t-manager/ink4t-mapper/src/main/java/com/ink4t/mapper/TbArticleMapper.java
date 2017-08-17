package com.ink4t.mapper;

import com.ink4t.pojo.TbArticle;
import com.ink4t.pojo.TbArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbArticleMapper {
    int countByExample(TbArticleExample example);

    int deleteByExample(TbArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbArticle record);

    int insertSelective(TbArticle record);

    List<TbArticle> selectByExample(TbArticleExample example);

    TbArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByExample(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByPrimaryKeySelective(TbArticle record);

    int updateByPrimaryKey(TbArticle record);
}
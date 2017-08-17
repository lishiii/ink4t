package com.ink4t.mapper;

import com.ink4t.pojo.Articlecomment;
import com.ink4t.pojo.ArticlecommentExample;
import com.ink4t.pojo.ArticlecommentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticlecommentMapper {
    int countByExample(ArticlecommentExample example);

    int deleteByExample(ArticlecommentExample example);

    int deleteByPrimaryKey(ArticlecommentKey key);

    int insert(Articlecomment record);

    int insertSelective(Articlecomment record);

    List<Articlecomment> selectByExample(ArticlecommentExample example);

    Articlecomment selectByPrimaryKey(ArticlecommentKey key);

    int updateByExampleSelective(@Param("record") Articlecomment record, @Param("example") ArticlecommentExample example);

    int updateByExample(@Param("record") Articlecomment record, @Param("example") ArticlecommentExample example);

    int updateByPrimaryKeySelective(Articlecomment record);

    int updateByPrimaryKey(Articlecomment record);
}
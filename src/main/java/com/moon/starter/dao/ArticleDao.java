package com.moon.starter.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moon.starter.dto.Article;

@Mapper // 이렇게 해주면 ArticleDao의 구현체를 마이바티스가 대신 구현해준다 
public interface ArticleDao {
	public int getTotalCount();

	public List<Article> getList();

	public void add(Map<String, Object> param);

	public Article getOne(long id);

	public void delete(long id);

}

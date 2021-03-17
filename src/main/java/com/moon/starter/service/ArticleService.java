package com.moon.starter.service;

import java.util.List;
import java.util.Map;

import com.moon.starter.dto.Article;

public interface ArticleService {
	
	public List<Article> getList();

	public void add(Map<String, Object> param);
	
	
}

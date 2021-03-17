package com.moon.starter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.starter.dao.ArticleDaoImple;
import com.moon.starter.dto.Article;

@Service

public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleDaoImple articleDao;

	// 이제 ArticleService는 데이터 관련해서는 모두 Dao 에게 위임
	public List<Article> getList() {
		return articleDao.getList();

	}
}
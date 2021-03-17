package com.moon.starter.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.starter.controller.ArticleController;
import com.moon.starter.dao.ArticleDao;
import com.moon.starter.dto.Article;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleDao articleDao;

	// 이제 ArticleService는 데이터 관련해서는 모두 Dao 에게 위임
	public List<Article> getList() {
		return articleDao.getList();

	}

	@Override
	public long add(Map<String, Object> param) {
		articleDao.add(param);
		
//		log.info("newId : " + param.get("id"));
		BigInteger bigIntId = (BigInteger)param.get("id");
		long newId = bigIntId.longValue();
		
		return newId;
	}
}
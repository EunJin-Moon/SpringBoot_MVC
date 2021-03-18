package com.moon.starter.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.starter.controller.ArticleController;
import com.moon.starter.dao.ArticleDao;
import com.moon.starter.dto.Article;
import com.moon.starter.util.CUtil;

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
//		BigInteger bigIntId = (BigInteger)param.get("id");
//		long newId = bigIntId.longValue();

		return CUtil.getAsLong(param.get("id"));
	}

	@Override
	public int getTotalCount() {
		return articleDao.getTotalCount();
	}

	@Override
	public Article getOne(long id) {
		return articleDao.getOne(id);
	}
	@Override
	public void hitUp(long id) {
		articleDao.hitUp(id);
	}

	@Override
	public void modify(Map<String, Object> param) {
		articleDao.modify(param);

	}

	@Override
	public void delete(long id) {
		articleDao.delete(id);
	}

	

}
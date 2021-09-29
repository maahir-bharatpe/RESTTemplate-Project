package com.resttemp.demo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resttemp.demo.dao.*;
import com.resttemp.demo.entities.Encapsulator;
import com.resttemp.demo.entities.MyArticles;;
@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired
	private ArticlesDao articlesdao;
	@Override
	public Iterable<MyArticles> getArticles(){
		return articlesdao.findAll();
	}
	@Override
	public void addArticle(MyArticles myarticle) {
		articlesdao.save(myarticle);
	}
	@Override
	public void add() {
		articlesdao.update();
		articlesdao.update1();
	}
	@Override
	public List<MyArticles> getByName(String name) {
		System.out.println(name);
		List<MyArticles> ans = articlesdao.search(name);
		return ans;
	}
}

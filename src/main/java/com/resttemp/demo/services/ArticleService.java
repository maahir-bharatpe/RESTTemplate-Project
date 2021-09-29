package com.resttemp.demo.services;

import java.util.List;

import com.resttemp.demo.entities.Encapsulator;
import com.resttemp.demo.entities.MyArticles;

public interface ArticleService {
	public Iterable<MyArticles> getArticles();
	public void addArticle(MyArticles myarticle);
	public List<MyArticles> getByName(String name);
	public void add();
}

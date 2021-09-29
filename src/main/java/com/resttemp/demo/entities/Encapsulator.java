package com.resttemp.demo.entities;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Encapsulator {
	public String status;
	public String totalResults;
	public List<MyArticles> articles;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public Encapsulator(String status, String totalResults, List<MyArticles> articles) {
		super();
		this.status = status;
		this.totalResults = totalResults;
		this.articles = articles;
	}
	public Encapsulator() {

	}
	
}

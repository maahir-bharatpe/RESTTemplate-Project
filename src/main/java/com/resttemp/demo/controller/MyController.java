package com.resttemp.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.resttemp.demo.entities.Encapsulator;
import com.resttemp.demo.entities.MyArticles;
import com.resttemp.demo.services.ArticleService;

@RestController
public class MyController {
	@Autowired
	private ArticleService articleservice;
	@GetMapping("/init")
	public String tested() {
    	RestTemplate restTemplate = new RestTemplate();
    	String baseUrl = "http://newsapi.org/v2/top-headlines?category=technology&apiKey=2312eef4a44f4a6a81f41daf0d6050b5";
//    	ObjectMapper objectMapper = new ObjectMapper();
    	Encapsulator local = restTemplate.getForObject(baseUrl, Encapsulator.class);
    	for(int i=0;i<local.articles.size();i++) {
    		articleservice.addArticle(local.articles.get(i));
    	}
    			return "Tried and tested :)";
	}
	@GetMapping("/articles")
	public Iterable<MyArticles> fetch() {
		return articleservice.getArticles();
	}
	@GetMapping("/articles/{name}")
	public List<MyArticles> getByName(@PathVariable String name) {
		return articleservice.getByName(name);
	}
}
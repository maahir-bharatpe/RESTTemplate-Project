package com.resttemp.demo.entities;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table
public class MyArticles {
    @JsonIgnore()
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idd;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id",referencedColumnName="u_id")
	public articles_info source;
    
	public String author;
	public String title;
	@Column(length = 1000)
	public String description;
	public String url;
	public String urlToImage;
	public String publishedAt;
	@Column(length = 1000)
	public String content;
	public articles_info getSource() {
		return source;
	}
	public void setSource(articles_info source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlToImage() {
		return urlToImage;
	}
	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}
	public String getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public MyArticles(articles_info source, String author, String title, String description, String url, String urlToImage,
			String publishedAt, String content) {
		super();
		this.source = source;
		this.author = author;
		this.title = title;
		this.description = description;
		this.url = url;
		this.urlToImage = urlToImage;
		this.publishedAt = publishedAt;
		this.content = content;
	}
	public MyArticles() {
		super();
	}
	
}

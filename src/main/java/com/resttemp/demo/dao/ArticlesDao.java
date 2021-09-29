package com.resttemp.demo.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.resttemp.demo.entities.Encapsulator;
import com.resttemp.demo.entities.MyArticles;

public interface ArticlesDao extends CrudRepository<MyArticles,Long>{
  @Modifying(clearAutomatically = true)     @Transactional
  @Query(value="ALTER TABLE my_articles ADD id varchar(255)", nativeQuery = true)
  void update();
  
  @Modifying(clearAutomatically = true)     @Transactional
  @Query(value="ALTER TABLE my_articles ADD name varchar(255)", nativeQuery = true)
  void update1();
  
  @Query(value="insert into my_articles values(:author,:title,:description,:url,:urlToImage,:publishedAt,:content,:id,:name,", nativeQuery = true)
  void addData(String author, String title, String description, String url, String urlToImage, String publishedAt, String content,String id, String name);
  
  @Query(value="select * from articles_info INNER JOIN my_articles ON articles_info.u_id = my_articles.id WHERE name= :name", nativeQuery = true)
  List<MyArticles> search(String name);
}

package com.zhuphon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhuphon.entity.Article;

/**
 * 
 * 文章controller
 *
 * @author Zhu Phon
 * @date 2018年2月5日
 */
@RestController
@RequestMapping("/api/articles")
public class ArticleController {

	@GetMapping
	public List<Article> getArticles(){
		
		return new ArrayList<>();
	}
	
	@GetMapping("/{id}")
	public Article getArticle(@PathVariable String id){
		return new Article();
	}
	
	@PostMapping
	public Article addArticle(@RequestBody Article article){
		return article;
	}
	
	@PutMapping("/{id}")
	public Article updateArticle(@PathVariable String id, @RequestBody Article article){
		return article;
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteArticle(@PathVariable String id){
		
		return true;
	}
}

package com.zhuphon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.zhuphon.entity.Article;

/**
 * 
 * 文章controller
 *
 * @author Zhu Phon
 * @date 2018年2月5日
 */
public class ArticleController {

	@GetMapping(value="articles")
	public List<Article> articles(){
		
		return new ArrayList<>();
	}
}

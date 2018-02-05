package com.zhuphon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.zhuphon.entity.Article;

/**
 * 
 * ����controller
 *
 * @author Zhu Phon
 * @date 2018��2��5��
 */
public class ArticleController {

	@GetMapping(value="articles")
	public List<Article> articles(){
		
		return new ArrayList<>();
	}
}

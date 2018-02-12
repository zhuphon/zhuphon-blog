package com.zhuphon.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 
 * 文章实体类
 *
 * @author Zhu Phon
 * @date 2018年2月5日
 */
@Data
public class Article {

	/** id */
	private String id;
	
	/** 标题 */
	private String title;
	
	/** 内容 */
	private String content;
	
	/** 作者 */
	private String author;
	
	/** 时间 */
	private Date createTime;
	
	/** 标签 */
	private List<String> tags;
}

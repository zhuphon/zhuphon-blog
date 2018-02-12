package com.zhuphon.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 
 * ����ʵ����
 *
 * @author Zhu Phon
 * @date 2018��2��5��
 */
@Data
public class Article {

	/** id */
	private String id;
	
	/** ���� */
	private String title;
	
	/** ���� */
	private String content;
	
	/** ���� */
	private String author;
	
	/** ʱ�� */
	private Date createTime;
	
	/** ��ǩ */
	private List<String> tags;
}

package com.platform.task.dto;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * 
 *************************************************
 * 功能描述:  公用的DTO部分属性的抽象实体               
 * @author  Andy Wilkinson                   
 * @version 1.0                
 * @date    2019年7月30日 创建文件                                             
 * @see                        
 *************************************************
 */
@MappedSuperclass
public class BaseAbstractEntity implements Serializable {

	/** 序列化ID **/
	private static final long serialVersionUID = 6152340961024991592L;

}

package com.entity.model;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-02 14:39:25
 */
public class BumenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 人数
	 */
	
	private Integer renshu;
		
	/**
	 * 人员架构
	 */
	
	private String renyuanjiagou;
				
	
	/**
	 * 设置：人数
	 */
	 
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
				
	
	/**
	 * 设置：人员架构
	 */
	 
	public void setRenyuanjiagou(String renyuanjiagou) {
		this.renyuanjiagou = renyuanjiagou;
	}
	
	/**
	 * 获取：人员架构
	 */
	public String getRenyuanjiagou() {
		return renyuanjiagou;
	}
			
}

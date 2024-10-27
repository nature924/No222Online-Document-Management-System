package com.entity.view;

import com.entity.WendangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文档信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 14:39:25
 */
@TableName("wendangxinxi")
public class WendangxinxiView  extends WendangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WendangxinxiView(){
	}
 
 	public WendangxinxiView(WendangxinxiEntity wendangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, wendangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

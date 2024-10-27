package com.dao;

import com.entity.WendangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WendangxinxiVO;
import com.entity.view.WendangxinxiView;


/**
 * 文档信息
 * 
 * @author 
 * @email 
 * @date 2021-04-02 14:39:25
 */
public interface WendangxinxiDao extends BaseMapper<WendangxinxiEntity> {
	
	List<WendangxinxiVO> selectListVO(@Param("ew") Wrapper<WendangxinxiEntity> wrapper);
	
	WendangxinxiVO selectVO(@Param("ew") Wrapper<WendangxinxiEntity> wrapper);
	
	List<WendangxinxiView> selectListView(@Param("ew") Wrapper<WendangxinxiEntity> wrapper);

	List<WendangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WendangxinxiEntity> wrapper);
	
	WendangxinxiView selectView(@Param("ew") Wrapper<WendangxinxiEntity> wrapper);
	
}

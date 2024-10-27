package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WendangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WendangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WendangxinxiView;


/**
 * 文档信息
 *
 * @author 
 * @email 
 * @date 2021-04-02 14:39:25
 */
public interface WendangxinxiService extends IService<WendangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WendangxinxiVO> selectListVO(Wrapper<WendangxinxiEntity> wrapper);
   	
   	WendangxinxiVO selectVO(@Param("ew") Wrapper<WendangxinxiEntity> wrapper);
   	
   	List<WendangxinxiView> selectListView(Wrapper<WendangxinxiEntity> wrapper);
   	
   	WendangxinxiView selectView(@Param("ew") Wrapper<WendangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WendangxinxiEntity> wrapper);
   	
}


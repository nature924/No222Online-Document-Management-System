package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WendangxinxiDao;
import com.entity.WendangxinxiEntity;
import com.service.WendangxinxiService;
import com.entity.vo.WendangxinxiVO;
import com.entity.view.WendangxinxiView;

@Service("wendangxinxiService")
public class WendangxinxiServiceImpl extends ServiceImpl<WendangxinxiDao, WendangxinxiEntity> implements WendangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WendangxinxiEntity> page = this.selectPage(
                new Query<WendangxinxiEntity>(params).getPage(),
                new EntityWrapper<WendangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WendangxinxiEntity> wrapper) {
		  Page<WendangxinxiView> page =new Query<WendangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WendangxinxiVO> selectListVO(Wrapper<WendangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WendangxinxiVO selectVO(Wrapper<WendangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WendangxinxiView> selectListView(Wrapper<WendangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WendangxinxiView selectView(Wrapper<WendangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

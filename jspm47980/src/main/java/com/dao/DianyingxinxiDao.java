package com.dao;

import com.entity.DianyingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianyingxinxiVO;
import com.entity.view.DianyingxinxiView;


/**
 * 电影信息
 * 
 * @author 
 * @email 
 * @date 2023-02-25 11:13:48
 */
public interface DianyingxinxiDao extends BaseMapper<DianyingxinxiEntity> {
	
	List<DianyingxinxiVO> selectListVO(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
	
	DianyingxinxiVO selectVO(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
	
	List<DianyingxinxiView> selectListView(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);

	List<DianyingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
	
	DianyingxinxiView selectView(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);



}

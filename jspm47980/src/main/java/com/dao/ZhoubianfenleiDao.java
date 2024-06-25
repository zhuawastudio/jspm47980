package com.dao;

import com.entity.ZhoubianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubianfenleiVO;
import com.entity.view.ZhoubianfenleiView;


/**
 * 周边分类
 * 
 * @author 
 * @email 
 * @date 2023-02-25 11:13:48
 */
public interface ZhoubianfenleiDao extends BaseMapper<ZhoubianfenleiEntity> {
	
	List<ZhoubianfenleiVO> selectListVO(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
	
	ZhoubianfenleiVO selectVO(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
	
	List<ZhoubianfenleiView> selectListView(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);

	List<ZhoubianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
	
	ZhoubianfenleiView selectView(@Param("ew") Wrapper<ZhoubianfenleiEntity> wrapper);
	

}

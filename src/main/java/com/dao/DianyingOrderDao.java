package com.dao;

import com.entity.DianyingOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingOrderView;

/**
 * 电影购买 Dao 接口
 *
 * @author 
 */
public interface DianyingOrderDao extends BaseMapper<DianyingOrderEntity> {

   List<DianyingOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

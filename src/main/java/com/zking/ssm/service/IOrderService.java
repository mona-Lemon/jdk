package com.zking.ssm.service;

import com.zking.ssm.model.Order;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mona
 * @site www.xiaomage.com
 * @company T250
 * @create  2020-11-29 15:58
 */
@Transactional
public interface IOrderService {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    @Transactional(readOnly = true)
    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}

package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mona
 * @site www.xiaomage.com
 * @company T250
 * @create  2020-11-29 15:06
 */
@Transactional
public interface ICustomerService {

        int deleteByPrimaryKey(Integer customerId);

        int insert(Customer record);

        int insertSelective(Customer record);

        @Transactional(readOnly = true)
        Customer selectByPrimaryKey(Integer customerId);

        int updateByPrimaryKeySelective(Customer record);

        int updateByPrimaryKey(Customer record);

        /**
         * 根据客户信息查询所有客户及订单信息
         *
         */
        @Transactional(readOnly = true)
        List queryOrderByCost(Customer record);
    }


package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.CustomerMapper;
import com.zking.ssm.model.Customer;
import com.zking.ssm.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mona
 * @site www.xiaomage.com
 * @company T250
 * @create  2020-11-29 15:07
 */
@Service
@Scope("prototype")
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public int deleteByPrimaryKey(Integer customerId) {
        return customerMapper.deleteByPrimaryKey(customerId);
    }

    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        return customerMapper.insertSelective(record);
    }

    @Override
    public Customer selectByPrimaryKey(Integer customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return customerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryOrderByCost(Customer record) {
        return customerMapper.queryOrderByCost(record);
    }
}

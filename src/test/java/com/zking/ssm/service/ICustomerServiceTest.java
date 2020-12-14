package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.model.Order;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author mona
 * @site www.xiaomage.com
 * @company T250
 * @create  2020-11-29 15:41
 */

public class ICustomerServiceTest extends BaseTestCase{
    @Autowired
    private  ICustomerService iCustomerService;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer=new Customer();
    }

    @Test
    public void insert() {
        customer.setCustomerId(null);
        customer.setCustomerName("社会我圭姐");
        iCustomerService.insert(customer);
    }

    @Test
    public void updateByPrimaryKey() {

    }

    @Test
    public void queryOrderByCost() {
        customer.setCustomerId(2);
        List<Customer> lst=iCustomerService.queryOrderByCost(customer);
        lst.forEach(c->{
            System.out.println(c);
            List<Order> list=c.getOrders();
            list.forEach(a->{
                System.out.println();
            });
        });

    }

    @Test
    public void selectByPrimarykey(){
        Customer c=iCustomerService.selectByPrimaryKey(4);
        System.out.println(c);
    }
}
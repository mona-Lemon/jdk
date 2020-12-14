package com.zking.ssm.model;

import lombok.Data;

import java.util.List;
@Data
//@Getter
//@Setter
public class Customer {
    private Integer customerId;

    private String customerName;

    private List Orders;

}

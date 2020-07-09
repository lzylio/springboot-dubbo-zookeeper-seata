package com.viewscenes.common.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDTO implements Serializable {
    private Integer id;
    private String orderNo;
    private String userId;
    private String commodityCode;
    private Integer count;
    private Double amount;
    //是否触发分布式事务回滚 1：回滚
    private String tag;
}

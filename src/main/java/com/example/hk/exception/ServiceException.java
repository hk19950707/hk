package com.example.hk.exception;

/**
 * 业务异常类
 * @Author: hk
 * @Date: 2018/11/15 11:23
 * @Description:
 */
public class ServiceException extends RuntimeException {


    public final static ServiceException PLAN_ALREADY_RELEASE = new ServiceException("计划已发布!");
    public final static ServiceException ADD_ORDER_FAIL = new ServiceException("工单中心新增失败!");

    public ServiceException(String message) {
        super(message);
    }

}

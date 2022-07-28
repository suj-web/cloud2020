package com.atguigu.springcloud.service;

import com.atguigu.springcloud.pojo.Payment;

public interface PaymentService {
    /**
     * 添加
     * @param payment
     * @return
     */
    Integer create(Payment payment);

    /**
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}

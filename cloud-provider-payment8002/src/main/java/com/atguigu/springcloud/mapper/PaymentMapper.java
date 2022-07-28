package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.pojo.Payment;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMapper {
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

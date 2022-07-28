package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentNacosFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderNacosController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private PaymentNacosFeignService paymentNacosFeignService;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id, String.class);
    }

    @GetMapping(value = "/consumer/payment/nacos/feign/{id}")
    public String paymentInfo2(@PathVariable("id") Integer id){
        return paymentNacosFeignService.getPayment(id);
    }
}

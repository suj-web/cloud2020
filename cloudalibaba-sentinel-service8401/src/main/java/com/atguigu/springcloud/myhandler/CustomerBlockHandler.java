package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.pojo.CommonResult;
import com.atguigu.springcloud.pojo.Payment;

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException excpetion){
        return new CommonResult(4444,"按客户自定义,global handleException-----1");
    }

    public static CommonResult handlerException2(BlockException excpetion){
        return new CommonResult(4444,"按客户自定义,global handleException----2");
    }
}

package com.mujio.mymall.member.feign;

import com.mujio.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 告诉SpringCloud这是个远程客户端
@FeignClient("mymall-coupon")
public interface CouponFeignService {
    // 远程接口的全限定
    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}

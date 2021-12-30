package com.lyoto.gulimall.coupon;

import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GulimallCouponApplicationTests {

	@Test
	public void contextLoads() {
		StringBuilder stringBuilder = new StringBuilder("20210212");
		String s = stringBuilder.insert(4, "-").insert(7,"-").toString();
		System.out.println(s);
	}

}

package com.hfut.shopping;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hfut.shopping.mapper.OrderInsListMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderSrvApplicationTests {
	
	@Autowired
	OrderInsListMapper mapper;

	@Test
	public void contextLoads() {
		System.out.println(mapper.select(53L));
	}
	

}


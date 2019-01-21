package com.hfut.shopping.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class OrderInstance {

	int id;
	
	String commodityName;
	
	String shopName;
	
	int type;
	
	int price;
}

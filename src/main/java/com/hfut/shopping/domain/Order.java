package com.hfut.shopping.domain;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Order {

	int id;
	
	Long consumerId;
	
	int price;
	
	List<OrderInstance> instances;
}

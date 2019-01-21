package com.hfut.shopping.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hfut.shopping.domain.OrderInstance;

@Component
public interface OrderInsListMapper {

	List<OrderInstance> select(long productorId);
	
	int delete(int instanceId);
}

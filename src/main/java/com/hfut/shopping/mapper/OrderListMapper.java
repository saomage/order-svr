package com.hfut.shopping.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hfut.shopping.domain.Order;

@Component
public interface OrderListMapper {

	List<Order> select(long consumerId);
}

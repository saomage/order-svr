package com.hfut.shopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hfut.shopping.domain.Consumer;
import com.hfut.shopping.domain.Order;
import com.hfut.shopping.mapper.OrderListMapper;

@Controller
public class ConsumerController {
	
	@Autowired
	OrderListMapper mapper;

	@GetMapping("order/consumer/list")
	public ModelAndView orderList(HttpServletRequest req) {
		Consumer consumer = (Consumer) req.getAttribute("consumer");
		List<Order> orders = mapper.select(consumer.getId());
		ModelAndView mv = new ModelAndView();
		mv.addObject("orders", orders);
		mv.setViewName("consumerOrder");
		return mv;
	}
}

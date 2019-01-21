package com.hfut.shopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hfut.shopping.domain.OrderInstance;
import com.hfut.shopping.domain.Productor;
import com.hfut.shopping.mapper.OrderInsListMapper;

@Controller
public class ProductorController {
	
	@Autowired
	OrderInsListMapper mapper;

	@GetMapping("order/productor/list")
	public ModelAndView orderList(HttpServletRequest req) {
		Productor productor = (Productor) req.getAttribute("productor");
		List<OrderInstance> instances = mapper.select(productor.getId());
		ModelAndView mv = new ModelAndView();
		mv.addObject("instances", instances);
		mv.setViewName("productorOrder");
		return mv;
	}
	
	@GetMapping("order/productor/delete")
	public String delete(String id) {
		mapper.delete(Integer.valueOf(id));
		return "redirect:/order/productor/list";
	}
}

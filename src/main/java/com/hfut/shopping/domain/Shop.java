package com.hfut.shopping.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Component
@Data
@EqualsAndHashCode(callSuper = false)
public class Shop extends SimpleShop {

	private byte[] discountStrategy;

	private String countPay;

	public Shop() {
		super();
	}

}

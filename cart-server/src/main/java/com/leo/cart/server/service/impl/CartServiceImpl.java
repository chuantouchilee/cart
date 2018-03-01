package com.leo.cart.server.service.impl;

import org.springframework.stereotype.Service;

import com.leo.cart.server.service.CartService;
import com.leo.cart.server.vo.CartVo;

@Service
public class CartServiceImpl implements CartService {

	public CartVo show() {
		return new CartVo("gao", 18);
	}

}

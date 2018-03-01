package com.leo.cart.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leo.cart.server.service.CartService;
import com.leo.cart.server.vo.CartVo;

@RestController
public class CartController {
	
	@Autowired
	CartService cartService;

	@RequestMapping(value="/cart/get.do", method=RequestMethod.GET)
	public String cartTxt(){
		
		return "cartTxt : " + cartService.show().toString();
	}
	
	@RequestMapping(value="/cart/trace.do", method=RequestMethod.TRACE)
	public String cartTrace(CartVo cart){
		return cart.toString();
	}
	
	@RequestMapping(value="/cart/patch.do", method=RequestMethod.PATCH)
	public String cartPatch(CartVo cart){
		return cart.toString();
	}
	
	@RequestMapping(value="/cart/post.do", method=RequestMethod.POST)
	public String cartPost(CartVo cart){
		System.out.println(RequestMethod.POST);
		return cart.toString();
	}
	
	
	@RequestMapping(value="/cart/options.do", method=RequestMethod.OPTIONS)
	public String cartOptions(CartVo cart){
		System.out.println(cart);
		return cart.toString();
	}
}

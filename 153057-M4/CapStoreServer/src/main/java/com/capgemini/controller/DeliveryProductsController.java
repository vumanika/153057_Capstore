package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.service.DeliveryProductsService;

@RestController
public class DeliveryProductsController {
	@Autowired
	private DeliveryProductsService deliveryProductsService;

	@RequestMapping(value = "/deliveryProducts", method = RequestMethod.GET)
	public String quantityupdate1(int id) {
		return deliveryProductsService.deliveringProducts(id);

	}
}

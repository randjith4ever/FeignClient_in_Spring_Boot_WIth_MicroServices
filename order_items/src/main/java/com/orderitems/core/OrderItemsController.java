package com.orderitems.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;

@RequestMapping("/orderItems")
@Controller
public class OrderItemsController {
	@Autowired
	OrderItemsClientService orderItemsClientService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<OrderItems> saveOrderItems(@RequestBody OrderItems orderItems) throws Exception {
		/*
		 * if (orderItems == null) { orderItems = new OrderItems();
		 * orderItems.setProductCode(1L); orderItems.setProductName("One Plus");
		 * orderItems.setProductQuantity(10); }
		 */
		if(orderItems.getProductName()==null) {
			throw new RestClientException("Bad Request Mandatory fields(Product Name & Product Quantity) are missing...");
		}
		
		if(orderItems.getProductName().trim().isEmpty()) {
			throw new RestClientException("Bad Request Mandatory fields are Empty...");
		}
		
		return new ResponseEntity<OrderItems>(orderItemsClientService.saveOrderItem(orderItems),HttpStatus.CREATED);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<OrderItems>> getAllOrderItems() {
		
		List<OrderItems> orderItems = orderItemsClientService.getAllOrderItems();
		if(orderItems.isEmpty()) {
			throw new OrderNotFoundException("Order List is Empty... Try creating your first order");
		}
		return new ResponseEntity<List<OrderItems>>(orderItems,HttpStatus.OK);
	}

}

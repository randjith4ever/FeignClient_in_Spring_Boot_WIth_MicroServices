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

import feign.Response;

@RequestMapping("/orders")
@Controller
public class OrdersController {
	@Autowired
	OrderItemsClientService orderItemsClientService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Orders> saveOrderItems(@RequestBody Orders orders) throws Exception {
		
		if(orders.getCustomerName()==null || orders.getOrderDate()==null || 
				orders.getOrderItems()==null || orders.getShippingAddress()==null || orders.getTotal()==null) {
			throw new RestClientException("Unable to Save: Bad Request Mandatory fields(customerName, orderDate, shippingAddress, orderItems, Total) are missing...");
		}
		
		if(orders.getCustomerName().trim().isEmpty() ||
				orders.getOrderDate().trim().isEmpty() ||
				orders.getOrderItems().trim().isEmpty() ||
				orders.getShippingAddress().trim().isEmpty()) {
			throw new RestClientException("Bad Request Mandatory fields are Empty...");
		}
		
		return new ResponseEntity<Orders>(orderItemsClientService.saveOrder(orders),HttpStatus.CREATED);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Orders>> getAllOrderItems() {

		List<Orders> orders = orderItemsClientService.getAllOrders();
		if(orders.isEmpty()) {
			throw new OrderNotFoundException("Order List is Empty... Try creating your first order");
		}
		return new ResponseEntity<List<Orders>>(orders,HttpStatus.OK);
	}

}

package com.orderitems.core;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import feign.Headers;

@Headers("Content-Type: application/json")
@FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface OrderItemsClientService {
	@RequestMapping(value = "/orderItem/create", method = RequestMethod.POST)
	OrderItems saveOrderItem(@RequestBody OrderItems orderItems);

	@RequestMapping(value = "/orderItem/list", method = RequestMethod.GET)
	@ResponseBody
	List<OrderItems> getAllOrderItems();

	@RequestMapping(value = "/order/create", method = RequestMethod.POST)
	Orders saveOrder(@RequestBody Orders orders);

	@RequestMapping(value = "/order/list", method = RequestMethod.GET)
	@ResponseBody
	List<Orders> getAllOrders();

}

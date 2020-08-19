package com.orders.oms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orders.service.OrderItemsServices;

@RestController
@RequestMapping("/orders")
public class OrderItemsController {
	
	@Autowired
	private OrderItemsServices orderItemServices;
	
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public OrderItems saveOrder(@RequestBody OrderItems orders) {
    	orderItemServices.create(orders);
        return orders;
    }
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<OrderItems> getAllOrders() {
    	List<OrderItems> orderList = orderItemServices.findAllOrderItems();
        return orderList;
    }
}

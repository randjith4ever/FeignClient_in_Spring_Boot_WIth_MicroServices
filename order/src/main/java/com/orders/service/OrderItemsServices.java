package com.orders.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orders.exception.OrderItemException;
import com.orders.oms.OrderItems;
import com.orders.repository.OrderItemsRepository;

@Service
public class OrderItemsServices {

	@Autowired
	private OrderItemsRepository orderItemsRepository;

	@Transactional
	public OrderItems create(OrderItems orderItem) {
		OrderItems newOrder = orderItem;
		System.out.println(newOrder);
		return orderItemsRepository.saveAndFlush(newOrder);
	}

	public OrderItems findById(Integer id) {
		return orderItemsRepository.findOne(id);
	}

	public OrderItems update(OrderItems orderItem, Integer id) throws OrderItemException {
		OrderItems updateOrderItem = orderItemsRepository.findOne(id);
		if (updateOrderItem == null)
			throw new OrderItemException();

		updateOrderItem.setProductName(orderItem.getProductName());
		updateOrderItem.setProductQuantity(orderItem.getProductQuantity());
		orderItemsRepository.saveAndFlush(updateOrderItem);
		return updateOrderItem;

	}

	public OrderItems delete(Integer id) throws OrderItemException {
		OrderItems deleteOrderItem = orderItemsRepository.findOne(id);
		if (deleteOrderItem == null)
			throw new OrderItemException();
		orderItemsRepository.delete(deleteOrderItem);
		return deleteOrderItem;
	}

	public List<OrderItems> findAllOrderItems() {
		return orderItemsRepository.findAll();
	}

}

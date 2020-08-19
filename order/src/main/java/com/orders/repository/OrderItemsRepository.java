package com.orders.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orders.oms.OrderItems;

@Repository
@Transactional
public interface OrderItemsRepository extends JpaRepository<OrderItems, Integer> {

/*	@Query("SELECT DISTINCT o FROM Order o WHERE s.order_id = (:order_id)")
    public Order retrieveByOrderId(@Param("order_id") String orderId);
	
	@Query("DELETE FROM Order o WHERE s.order_id = (:order_id)")
	public void deleteByOrderId(@Param("order_id") String orderId); */
}

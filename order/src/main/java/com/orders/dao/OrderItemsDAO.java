package com.orders.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orders.oms.OrderItems;

@Repository
@Transactional
public interface OrderItemsDAO extends JpaRepository<OrderItems, Long> {

}
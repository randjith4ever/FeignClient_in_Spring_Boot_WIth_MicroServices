package com.orderitems.core;

public class Orders {

	private Integer customerId;
	private String customerName;
	private String orderDate;
	private String shippingAddress;
	private String orderItems;
	private Integer total;

	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(Integer customerId, String customerName, String orderDate, String shippingAddress, String orderItems,
			Integer total) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.shippingAddress = shippingAddress;
		this.orderItems = orderItems;
		this.total = total;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(String orderItems) {
		this.orderItems = orderItems;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orders [customerId=" + customerId + ", customerName=" + customerName + ", orderDate=" + orderDate
				+ ", shippingAddress=" + shippingAddress + ", orderItems=" + orderItems + ", total=" + total + "]";
	}
}

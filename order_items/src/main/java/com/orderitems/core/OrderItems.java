package com.orderitems.core;

public class OrderItems {
	
	private Long productCode;
	private String productName;
	private Integer productQuantity;
	
	public OrderItems() {
		// TODO Auto-generated constructor stub
	}

	public OrderItems(Long productCode, String productName, Integer productQuantity) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "OrderItems [productCode=" + productCode + ", productName=" + productName + ", productQuantity="
				+ productQuantity + "]";
	}
}

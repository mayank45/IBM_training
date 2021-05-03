package com.demo.service;

import com.demo.exceptoin.OrderException;
import com.demo.model.Order;

public interface OrderService {
	boolean placeOrder(Order order) throws OrderException; 
	boolean deleteOrder(int id) throws OrderException;
	boolean cancelOrder(int id) throws OrderException;
	int trackOrder() throws OrderException;// DTDC, Fedex
}

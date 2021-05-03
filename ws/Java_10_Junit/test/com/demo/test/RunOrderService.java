package com.demo.test;

import com.demo.dao.OrderDaoImpl;
import com.demo.exceptoin.OrderException;
import com.demo.model.Order;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class RunOrderService {

	public static void main(String[] args) {
		OrderService os = new OrderServiceImpl(new OrderDaoImpl());
		try {
			boolean orderPlaced = os.placeOrder(new Order(125, "Order new item"));
			System.out.println("orderPlaced: "+orderPlaced);
		} catch (OrderException e) {
			System.out.println(e.getMessage());
			System.out.println("some error occurred");
		}
	}
}

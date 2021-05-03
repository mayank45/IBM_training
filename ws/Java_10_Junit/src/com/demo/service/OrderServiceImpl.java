package com.demo.service;

import java.sql.SQLException;

import com.demo.dao.OrderDao;
import com.demo.exceptoin.OrderException;
import com.demo.model.Order;

public class OrderServiceImpl implements OrderService {

	private OrderDao dao;
	
	public OrderServiceImpl(OrderDao dao) {
		this.dao = dao;
	}
	
	@Override
	public boolean placeOrder(Order order) throws OrderException{
		// verify
		try {
			int id = dao.createOrder(order);
			System.out.println("in service, id: "+id);
			if(id < 1) {
				return false;
			}
		} catch (SQLException e) {
			throw new OrderException("Database error", e);
		} catch (Exception e) {
			throw new OrderException("invalid code", e);
		}
		return true;
	}

	@Override
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelOrder(int id) {
		// TODO Auto-generated method stub
		// order with id, status -> cancel
		return false;
	}

	@Override
	public int trackOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}

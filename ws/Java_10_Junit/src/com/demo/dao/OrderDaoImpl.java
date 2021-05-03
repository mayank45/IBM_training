package com.demo.dao;

import java.sql.SQLException;

import com.demo.model.Order;

public class OrderDaoImpl implements OrderDao {

	@Override
	public int createOrder(Order order) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("in dao layer+++++++++++++++++++++++++++++");
		return 0;
	}

	@Override
	public Order findOrder(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOrder(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOrder(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

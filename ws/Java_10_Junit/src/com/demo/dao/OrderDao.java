package com.demo.dao;

import java.sql.SQLException;

import com.demo.model.Order;

public interface OrderDao {
	// database
	int createOrder(Order order) throws SQLException;
	Order findOrder(int id) throws SQLException;
	int updateOrder(int id) throws SQLException;
	int deleteOrder(int id) throws SQLException;
	
//	findTrackingId
}

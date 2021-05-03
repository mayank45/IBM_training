package com.demo.test;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImpl;
import com.demo.exceptoin.OrderException;
import com.demo.model.Order;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class TestOrderService {

	@Mock
	OrderDao dao;
	OrderService service;
	
	
	@Before
	public void setUp() {
//		dao = new OrderDaoImpl();
		MockitoAnnotations.initMocks(this);
		service = new OrderServiceImpl(dao);
	}
	
	@Test
	// should place order
	public void shouldPlaceOrder() throws OrderException, SQLException {
//		service.placeorder->dao.createOrder(order)
//			1 - > order placed
//			25 -> order placed
//			0 -> order not placed
		Order order = new Order();
		Mockito.when(dao.createOrder(order)).thenReturn(25);
		
		boolean orderPlaced = service.placeOrder(order);
		Assert.assertTrue(orderPlaced);
	}
	@Test
	// should not place order
	public void shouldNotPlaceOrder() throws OrderException, SQLException {
//		service.placeorder->dao.createOrder
//		0 -> order not placed
		Order order = new Order();
		Mockito.when(dao.createOrder(order)).thenReturn(0);
		
		boolean orderPlaced = service.placeOrder(order);
		Assert.assertFalse(orderPlaced);
	}
	
	
	@Test(expected = OrderException.class)
	public void shouldRaiseSqlException() throws SQLException, OrderException {
		Order order = new Order();
		Mockito.when(dao.createOrder(order)).thenThrow(new SQLException());
		
		service.placeOrder(order);
		}

	@Test(expected = OrderException.class)
	public void shouldRaiseException() throws SQLException, OrderException {
		Order order = new Order();
		Mockito.when(dao.createOrder(order)).thenThrow(new NullPointerException());
		
		service.placeOrder(order);
		}
	
	@Test(expected = ArithmeticException.class)
	public void demo() {
		throw new ArithmeticException();
//		Calculator.div(24, 0);
	}
}

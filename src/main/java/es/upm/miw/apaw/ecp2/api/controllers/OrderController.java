package es.upm.miw.apaw.ecp2.api.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.upm.miw.apaw.ecp2.api.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.api.dtos.OrderDto;
import es.upm.miw.apaw.ecp2.api.entities.Order;

public class OrderController {

	public static List<OrderDto> orderList() {
        List<Order> orderList = DaoFactory.getFactory().getOrderDao().findAll();
        List<OrderDto> orderDtoList = new ArrayList<>();
        for (Order order : orderList) {
            orderDtoList.add(new OrderDto(order));
        }
        return orderDtoList;
    }
	
	public void createOrder(BigDecimal amount) {
        DaoFactory.getFactory().getOrderDao().create(new Order(amount));
    }

}

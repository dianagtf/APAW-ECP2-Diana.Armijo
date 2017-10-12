package es.upm.miw.apaw.ecp2.api.resources;

import java.math.BigDecimal;

import es.upm.miw.apaw.ecp2.api.controllers.OrderController;
import es.upm.miw.apaw.ecp2.api.resources.exceptions.OrderFieldEmptyException;


public class OrderResource{
	public static final String ORDERS = "orders";
	
	public static final String ID = "/{id}";
	
	public void createOrder(BigDecimal orderAmount) throws OrderFieldEmptyException {
        this.validateField(orderAmount);
        new OrderController().createOrder(orderAmount);
    }
	
	private void validateField(BigDecimal field) throws OrderFieldEmptyException {
        if (field == null ) {
            throw new OrderFieldEmptyException(field);
        }
    }


}

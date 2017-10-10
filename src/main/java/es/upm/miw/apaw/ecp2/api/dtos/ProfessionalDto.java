package es.upm.miw.apaw.ecp2.api.dtos;

import java.math.BigDecimal;
import java.util.Calendar;

import es.upm.miw.apaw.ecp2.api.entities.Order;
import es.upm.miw.apaw.ecp2.api.entities.Professional;

public class ProfessionalDto {

    private Calendar orderDate;

    private BigDecimal orderAmount;

    public ProfessionalDto() {
    }
    
    public ProfessionalDto(Professional professional) {
    }

    public ProfessionalDto(Order order) {
        this.orderDate = order.getDate();
        this.orderAmount = order.getAmount();
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setThemeName(Calendar orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setVoteValue(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "{\"orderDate\":\"" + orderDate + ",\"orderAmount\":" + orderAmount + "}";
    }

}

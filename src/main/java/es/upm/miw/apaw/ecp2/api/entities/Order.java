package es.upm.miw.apaw.ecp2.api.entities;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Order {

    private int id;
    private Calendar date;
    private BigDecimal amount;
    
    private Professional professional;

    public Order() {
    }

    public Order(BigDecimal amount) {
        this.date = Calendar.getInstance();
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }
    
    public void setAmount(int amount) {
        this.id = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    
    public Professional getProfessional() {
        return professional;
    }


    @Override
    public String toString() {
        String formattedDate = new SimpleDateFormat("HH:00 dd-MMM-yyyy ").format(date.getTime());
        return "Order [id=" + id + ", date=" + formattedDate  + ",amount=" + amount + "]" ;
    }

}

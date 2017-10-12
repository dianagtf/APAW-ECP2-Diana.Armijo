package es.upm.miw.apaw.ecp2.api.entities;

public class Professional {

    private long phone;

    private long city;
    
    private String type;

    private Order order;
    
    private String level;

    public Professional() {
    }
    
    public Professional(long phone) {
    	this.phone = phone;
    }

    public Professional(long phone, long city, Order order) {
    	this.phone = phone;
        this.city = city;
        this.setOrder(order);
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getCity() {
        return city;
    }

    public void setCity(long city) {
        this.city = city;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getLevel() {
    	return level;
    }
    
    public void setLevel(String level) {
    	this.level = level;
    }
    
    public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

    @Override
    public String toString() {
        return "Vote [phone=" + phone + ", city=" + city + ", type=" + type + ", level=" + level + "]";
    }

}

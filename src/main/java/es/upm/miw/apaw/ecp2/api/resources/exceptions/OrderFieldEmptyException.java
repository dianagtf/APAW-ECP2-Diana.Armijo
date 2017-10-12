package es.upm.miw.apaw.ecp2.api.resources.exceptions;

import java.math.BigDecimal;

public class OrderFieldEmptyException extends Exception {

	private static final long serialVersionUID = 1L;

	public static final String DESCRIPTION = "Cantidad vacía";

    public OrderFieldEmptyException(BigDecimal field) {
        super(DESCRIPTION + ". " + field);
    }


}

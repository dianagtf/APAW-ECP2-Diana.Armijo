package es.upm.miw.apaw.ecp2.api;

import java.math.BigDecimal;

import es.upm.miw.apaw.ecp2.api.controllers.ProfessionalController;
import es.upm.miw.apaw.ecp2.api.resources.OrderResource;
import es.upm.miw.apaw.ecp2.api.resources.ProfessionalResource;
import es.upm.miw.apaw.ecp2.api.resources.exceptions.RequestInvalidException;
import es.upm.miw.apaw.ecp2.http.HttpRequest;
import es.upm.miw.apaw.ecp2.http.HttpResponse;
import es.upm.miw.apaw.ecp2.http.HttpStatus;


public class Dispatcher {

	private OrderResource orderResource = new OrderResource();
	private ProfessionalController professionalController = new ProfessionalController();

	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

	public void doGet(HttpRequest request, HttpResponse response) {
		try {

			if (request.isEqualsPath(ProfessionalResource.PROFESSIONALS)) {
				
			} else if (request.isEqualsPath(ProfessionalResource.PROFESSIONALS + ProfessionalResource.PHONES)) {
				response.setBody("");
				
				/*professionalResource.readProfessional(Integer.valueOf(request.paths()[1])).toString()*/
			} else {
				throw new RequestInvalidException(request.getPath());
			}
		} catch (Exception e) {
			responseError(response, e);
		}
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		try {
			if (request.isEqualsPath(OrderResource.ORDERS)) {
				orderResource.createOrder(new BigDecimal(request.getBody()));
				response.setStatus(HttpStatus.CREATED);
			} else if (request.isEqualsPath(ProfessionalResource.PROFESSIONALS)) {

			} else {
				throw new RequestInvalidException(request.getPath());
			}
		} catch (Exception e) {
			responseError(response, e);
		}
	}

	public void doPut(HttpRequest request, HttpResponse response) {

	}

	public void doPatch(HttpRequest request, HttpResponse response) {

	}

	public void doDelete(HttpRequest request, HttpResponse response) {

	}

}

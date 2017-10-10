package es.upm.miw.apaw.ecp2.api.daos;

import java.util.List;

import es.upm.miw.apaw.ecp2.api.entities.Professional;

public interface ProfessionalDao extends GenericDao<Professional, Integer> {

    List<Integer> findValueByOrderId(int orderId);
}

package es.upm.miw.apaw.ecp2.api.daos;

import java.util.List;

import es.upm.miw.apaw.ecp2.api.entities.Order;
import es.upm.miw.apaw.ecp2.api.entities.Professional;

public interface GenericDao<T, ID> {

    void create(T entity);

    T read(ID id);

    void update(T entity);

    void deleteById(ID id);

    List<T> findAll();

	void setPhone(Professional entity, Long phone);

	long getPhone(Professional entity);


}

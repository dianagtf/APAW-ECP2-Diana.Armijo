package es.upm.miw.apaw.ecp2.api.daos.memory;

import es.upm.miw.apaw.ecp2.api.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.api.daos.OrderDao;
import es.upm.miw.apaw.ecp2.api.daos.ProfessionalDao;

public class DaoMemoryFactory extends DaoFactory {

    private OrderDao orderDao;

    private ProfessionalDao professionalDao;

    @Override
    public OrderDao getOrderDao() {
        if (orderDao == null) {
        	orderDao = new OrderDaoMemory();
        }
        return orderDao;
    }

    @Override
    public ProfessionalDao getProfessionalDao() {
        if (professionalDao == null) {
        	professionalDao = new ProfessionalDaoMemory();
        }
        return professionalDao;
    }

}

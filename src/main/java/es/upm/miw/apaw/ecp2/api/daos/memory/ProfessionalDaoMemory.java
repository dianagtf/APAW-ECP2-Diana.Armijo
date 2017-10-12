package es.upm.miw.apaw.ecp2.api.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.upm.miw.apaw.ecp2.api.daos.ProfessionalDao;
import es.upm.miw.apaw.ecp2.api.entities.Professional;

public class ProfessionalDaoMemory extends GenericDaoMemory<Professional> implements ProfessionalDao {

    public ProfessionalDaoMemory() {
        this.setMap(new HashMap<Integer, Professional>());
    }

    @Override
	public long getPhone(Professional entity) {
        return entity.getPhone();
    }

    @Override
	public void setPhone(Professional entity, Long phone) {
        entity.setPhone(phone);
    }

    @Override
    public List<Long> findValueByOrderId(int orderId) {
    	List<Professional> professionals = this.findAll();
        List<Long> professionalPhone = new ArrayList<>();
        for (Professional professional : professionals) {
            if (professional.getOrder().getId() == orderId) {
            	professionalPhone.add(professional.getPhone());
            }
        }
        return professionalPhone;
    }

	@Override
	protected Integer getId(Professional entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setId(Professional entity, Integer id) {
		// TODO Auto-generated method stub
		
	}

}

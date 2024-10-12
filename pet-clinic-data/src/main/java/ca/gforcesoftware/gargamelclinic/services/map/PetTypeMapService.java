package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.PetType;
import ca.gforcesoftware.gargamelclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-09
 */
@Service
public class PetTypeMapService extends AbstractMapService< PetType,  Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
            super.deleteById(id);
    }

    @Override
    public void delete(PetType t) {
        super.delete(t);
    }

    @Override
    public PetType save(PetType t) {
        return super.save(t);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}

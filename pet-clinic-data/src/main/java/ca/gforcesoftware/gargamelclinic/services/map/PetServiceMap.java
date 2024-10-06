package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.Pet;
import ca.gforcesoftware.gargamelclinic.services.CrudService;
import ca.gforcesoftware.gargamelclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet owner) {
        return super.save(owner.getId(), owner);
    }
}

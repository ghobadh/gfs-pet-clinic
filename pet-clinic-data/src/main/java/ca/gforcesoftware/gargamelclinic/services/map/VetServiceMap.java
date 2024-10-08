package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.Vet;
import ca.gforcesoftware.gargamelclinic.services.CrudService;
import ca.gforcesoftware.gargamelclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) { return super.save(vet); }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}

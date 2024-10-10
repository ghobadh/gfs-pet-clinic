package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.Specialty;
import ca.gforcesoftware.gargamelclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-10
 */
@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty t) {
        super.delete(t);
    }

    @Override
    public Specialty save(Specialty t) {
        return super.save(t);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}

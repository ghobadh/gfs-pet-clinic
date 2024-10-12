package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.Specialty;
import ca.gforcesoftware.gargamelclinic.model.Vet;
import ca.gforcesoftware.gargamelclinic.services.SpecialtyService;
import ca.gforcesoftware.gargamelclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }
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
    public Vet save(Vet vet) {
        if (vet.getSpecialties().size() > 0) {
            vet.getSpecialties().forEach(speciality -> {
                if(speciality.getId()== null){
                    Specialty savedSpecitalty = specialtyService.save(speciality);
                    speciality.setId(savedSpecitalty.getId());
                }
            });
        }
        return super.save(vet);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}

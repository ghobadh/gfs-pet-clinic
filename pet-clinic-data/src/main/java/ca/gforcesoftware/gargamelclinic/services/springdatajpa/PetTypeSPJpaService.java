package ca.gforcesoftware.gargamelclinic.services.springdatajpa;

import ca.gforcesoftware.gargamelclinic.model.PetType;
import ca.gforcesoftware.gargamelclinic.repositories.PetTypeRepository;
import ca.gforcesoftware.gargamelclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-12
 */
@Service
@Profile("springjpsdata")
public class PetTypeSPJpaService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeSPJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}

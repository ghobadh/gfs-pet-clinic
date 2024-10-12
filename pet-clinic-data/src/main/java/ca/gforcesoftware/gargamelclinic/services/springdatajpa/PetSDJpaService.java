package ca.gforcesoftware.gargamelclinic.services.springdatajpa;

import ca.gforcesoftware.gargamelclinic.model.Pet;
import ca.gforcesoftware.gargamelclinic.repositories.PetRepsitory;
import ca.gforcesoftware.gargamelclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-12
 */
@Service
@Profile("springjpsdata")
public class PetSDJpaService implements PetService {
    private final PetRepsitory petRepsitory;

    public PetSDJpaService(PetRepsitory petRepsitory) {
        this.petRepsitory = petRepsitory;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepsitory.findAll().forEach(pet -> pets.add(pet));
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepsitory.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepsitory.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petRepsitory.delete(pet);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepsitory.deleteById(aLong);
    }
}

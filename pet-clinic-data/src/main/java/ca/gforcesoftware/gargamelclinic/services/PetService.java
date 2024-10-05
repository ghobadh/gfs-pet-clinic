package ca.gforcesoftware.gargamelclinic.services;

import ca.gforcesoftware.gargamelclinic.model.Pet;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}

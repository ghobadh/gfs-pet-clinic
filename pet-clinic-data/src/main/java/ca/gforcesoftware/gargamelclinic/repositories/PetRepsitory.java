package ca.gforcesoftware.gargamelclinic.repositories;

import ca.gforcesoftware.gargamelclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author gavinhashemi on 2024-10-12
 */
public interface PetRepsitory extends CrudRepository<Pet, Long> {
}

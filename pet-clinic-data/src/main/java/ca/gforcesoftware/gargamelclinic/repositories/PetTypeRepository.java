package ca.gforcesoftware.gargamelclinic.repositories;

import ca.gforcesoftware.gargamelclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author gavinhashemi on 2024-10-12
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

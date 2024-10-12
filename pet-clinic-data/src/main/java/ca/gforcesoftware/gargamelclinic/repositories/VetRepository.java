package ca.gforcesoftware.gargamelclinic.repositories;

import ca.gforcesoftware.gargamelclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author gavinhashemi on 2024-10-12
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
    Vet findByLastName(String lastName);
}

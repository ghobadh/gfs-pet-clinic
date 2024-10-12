package ca.gforcesoftware.gargamelclinic.repositories;

import ca.gforcesoftware.gargamelclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author gavinhashemi on 2024-10-12
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}

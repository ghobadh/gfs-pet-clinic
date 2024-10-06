package ca.gforcesoftware.gargamelclinic.services;

import ca.gforcesoftware.gargamelclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}

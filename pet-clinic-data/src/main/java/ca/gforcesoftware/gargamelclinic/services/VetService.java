package ca.gforcesoftware.gargamelclinic.services;

import ca.gforcesoftware.gargamelclinic.model.Vet;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);

}

package ca.gforcesoftware.gargamelclinic.services;

import ca.gforcesoftware.gargamelclinic.model.Vet;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
public interface VetService {
    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}

package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.Owner;
import ca.gforcesoftware.gargamelclinic.services.CrudService;
import ca.gforcesoftware.gargamelclinic.services.OwnerService;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner t) {
        super.delete(t);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}

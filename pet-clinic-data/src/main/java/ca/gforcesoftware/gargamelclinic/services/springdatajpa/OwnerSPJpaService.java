package ca.gforcesoftware.gargamelclinic.services.springdatajpa;

import ca.gforcesoftware.gargamelclinic.model.Owner;
import ca.gforcesoftware.gargamelclinic.repositories.OwnerRepository;
import ca.gforcesoftware.gargamelclinic.repositories.PetRepsitory;
import ca.gforcesoftware.gargamelclinic.repositories.PetTypeRepository;
import ca.gforcesoftware.gargamelclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-12
 */
/*
I need to add @Profile annotation otherwise the program does not start. The reason is it will find two services for the
same implementation. in more detail, both OwnerServiceMap and OwnerSPJpaService have implemented OwnerService and both
used @Service. Therefore, I have to add @Profile to prevent it. Of course, other option was using @Primary and
@Qualifier.
 */
@Service
@Profile("springjpsdata")
public class OwnerSPJpaService implements OwnerService{
    private final OwnerRepository ownerRepository;
    private final PetRepsitory petRepository;
    private final PetTypeRepository typeRepository;

    public OwnerSPJpaService(OwnerRepository ownerRepository, PetRepsitory petRepository,
                             PetTypeRepository typeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.typeRepository = typeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null) ;
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

}

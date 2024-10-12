package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.Owner;
import ca.gforcesoftware.gargamelclinic.model.Pet;
import ca.gforcesoftware.gargamelclinic.services.OwnerService;
import ca.gforcesoftware.gargamelclinic.services.PetService;
import ca.gforcesoftware.gargamelclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
        if (owner != null) {
            if (owner.getPets() != null) {
                owner.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet type is requied");
                    }
                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
                return super.save(owner);
            } else {
                return null;
            }

        }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}

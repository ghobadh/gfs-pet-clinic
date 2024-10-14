package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.Owner;
import ca.gforcesoftware.gargamelclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author gavinhashemi on 2024-10-14
 */
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    private Long ownerId = 100L;
    private String lastName = "Gargamel";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerMapService.findAll();
        assertNotNull(owners);
        assertEquals(1, owners.size());
        assertEquals(ownerId, owners.iterator().next().getId());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0, ownerMapService.findAll().size());

    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExitingId() {
        Owner owner = Owner.builder().id(2L).build();
        // Just a reminder When I save the owner then the ID is created; otherwise, id will stay empty if I don't save it.
        Owner savedOwner = ownerMapService.save(owner);
        assertEquals(2L, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner owner = ownerMapService.save(Owner.builder().build());
        assertNotNull(owner);
        assertNotNull( owner.getId());
    }

    @Test
    void findByLastName() {
        Owner gargamel = ownerMapService.findByLastName(lastName);
        assertNotNull(gargamel);
        assertEquals(lastName, gargamel.getLastName());
        assertEquals(ownerId, gargamel.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner gargamel = ownerMapService.findByLastName("haha");

        assertNull(gargamel );

    }
}
package ca.gforcesoftware.gargamelclinic.services.springdatajpa;

import ca.gforcesoftware.gargamelclinic.model.Owner;
import ca.gforcesoftware.gargamelclinic.repositories.OwnerRepository;
import ca.gforcesoftware.gargamelclinic.repositories.PetRepsitory;
import ca.gforcesoftware.gargamelclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

/**
 * @author gavinhashemi on 2024-10-14
 */
@ExtendWith(MockitoExtension.class)
class OwnerSPJpaServiceTest {

    @Mock
    private OwnerRepository ownerRepository;
    @Mock
    private PetRepsitory petRepsitory;
    @Mock
    private PetTypeRepository petTypeRepository;

    //Since we inject mock of the object, we don't need to initiate it. As you can see the findByLastName
    // is working fine. without any initialization.
    @InjectMocks
    private OwnerSPJpaService ownerSPJpaService;

    private final String LASTNAME = "gargamel" ;
    private Owner returnOwner;

    @BeforeEach
    void setUp() {
       returnOwner = Owner.builder().id(1L).lastName(LASTNAME).build();

    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner gargamel = ownerSPJpaService.findByLastName(LASTNAME);
        assertEquals(LASTNAME, gargamel.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(owners);
        Set<Owner> gargamel = ownerSPJpaService.findAll();
        assertEquals(2, gargamel.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner gargamel = ownerSPJpaService.findById(1L);
        assertNotNull(gargamel);
    }

    @Test
    void save() {

        when(ownerRepository.save(any(Owner.class))).thenReturn(returnOwner);
        Owner savedOwner = ownerSPJpaService.save(returnOwner);
        assertNotNull(savedOwner);
    }

    @Test
    void delete() {
        ownerSPJpaService.delete(returnOwner);
        verify(ownerRepository, times(1)).delete(returnOwner);
    }

    @Test
    void deleteById() {
        ownerSPJpaService.deleteById(1L);
        verify(ownerRepository).deleteById(anyLong());
    }
}
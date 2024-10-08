package ca.gforcesoftware.gargamelclinic.bootstrap;

import ca.gforcesoftware.gargamelclinic.model.Owner;
import ca.gforcesoftware.gargamelclinic.model.Vet;
import ca.gforcesoftware.gargamelclinic.services.OwnerService;
import ca.gforcesoftware.gargamelclinic.services.VetService;
import ca.gforcesoftware.gargamelclinic.services.map.OwnerServiceMap;
import ca.gforcesoftware.gargamelclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author gavinhashemi on 2024-10-06
 */
/*
By adding @Component, and implementing CommandLineRunner, DataLoader class is start running at the start up. we can the system out when the application starts

 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1= new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Jane");
        owner2.setLastName("Fonda");
        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Vet vet1= new Vet();
        vet1.setFirstName("Holo");
        vet1.setLastName(" Jigar");
        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Gavin");
        vet2.setLastName("Happyman");
        vetService.save(vet2);

        System.out.println("Loaded Vets.....");


    }
}

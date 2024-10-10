package ca.gforcesoftware.gargamelclinic.bootstrap;

import ca.gforcesoftware.gargamelclinic.model.*;
import ca.gforcesoftware.gargamelclinic.services.*;
import ca.gforcesoftware.gargamelclinic.services.map.OwnerServiceMap;
import ca.gforcesoftware.gargamelclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }


    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }



    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);


        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);


        Owner owner1= new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        owner1.setCity("San Francisco");
        owner1.setTelephone("1234567890");
        owner1.setAddress("San Francisco, CA");

        Pet johnDog = new Pet();
        johnDog.setPetType(dog);
        johnDog.setOwner(owner1);
        johnDog.setBirthDate(LocalDate.now());
        johnDog.setName("Rex");
        owner1.getPets().add(johnDog);

        Pet johnCat = new Pet();
        johnCat.setPetType(cat);
        johnCat.setOwner(owner1);
        johnCat.setBirthDate(LocalDate.now());
        johnCat.setName("Maloos");
        owner1.getPets().add(johnCat);

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Jane");
        owner2.setLastName("Fonda");
        owner2.setCity("San Jose");
        owner2.setTelephone("987654321");
        owner2.setAddress("San Jose, CA");

        Pet janeCat = new Pet();
        janeCat.setPetType(cat);
        janeCat.setOwner(owner1);
        janeCat.setBirthDate(LocalDate.now());
        janeCat.setName("Gaga");
        owner2.getPets().add(janeCat);
        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Specialty radiology = new Specialty();
        radiology.setDescription("radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Vet vet1= new Vet();
        vet1.setFirstName("Holo");
        vet1.setLastName("Jigar");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);


        Vet vet2= new Vet();
        vet2.setFirstName("Gavin");
        vet2.setLastName("Happyman");
        vet2.getSpecialities().add(savedDentistry);
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }
}

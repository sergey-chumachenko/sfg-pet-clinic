package org.springguru.chumick.sfgpetclinick.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springguru.chumick.sfgpetclinick.model.Owner;
import org.springguru.chumick.sfgpetclinick.model.Pet;
import org.springguru.chumick.sfgpetclinick.model.PetType;
import org.springguru.chumick.sfgpetclinick.service.OwnerService;
import org.springguru.chumick.sfgpetclinick.service.PetTypeService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Dog");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("serhii");
        owner1.setLastName("chumachenko");

        Pet pet1 = new Pet();
        pet1.setPetType(savedDogPetType);
        pet1.setName("qwerty");
        pet1.setOwner(owner1);
        pet1.setBirthDay(LocalDate.now().minus(10, ChronoUnit.YEARS));

        owner1.getPets().add(pet1);
        ownerService.save(owner1);


    }
}

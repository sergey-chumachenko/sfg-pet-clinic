package org.springguru.chumick.sfgpetclinick.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springguru.chumick.sfgpetclinick.model.*;
import org.springguru.chumick.sfgpetclinick.service.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;
    private final VetService vetService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, PetTypeService petTypeService, VetService vetService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
        this.vetService = vetService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int numPets = petTypeService.findAll().size();

        if (numPets == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Dog");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality industry = new Speciality();
        industry.setDescription("Industry");
        Speciality savedIndustry = specialityService.save(industry);

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

        Vet vet1 = new Vet();
        vet1.setFirstName("vet1 first name");
        vet1.setLastName("vet1 last name");
        vet1.getSpecialities().add(radiology);
        vetService.save(vet1);

        Visit visit1 = new Visit();
        visit1.setDate(LocalDate.now());
        visit1.setPet(pet1);
        visit1.setDescription("qqqq");
        visitService.save(visit1);

        Vet vet2 = new Vet();
        vet2.setFirstName("vet2 first name");
        vet2.setLastName("vet2 last name");
        vet2.getSpecialities().add(surgery);
        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("vet3 first name");
        vet3.setLastName("vet3 last name");
        vet3.getSpecialities().add(industry);
        vetService.save(vet3);
    }
}

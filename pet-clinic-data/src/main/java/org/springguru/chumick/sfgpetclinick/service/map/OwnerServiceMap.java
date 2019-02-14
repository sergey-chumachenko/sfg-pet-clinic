package org.springguru.chumick.sfgpetclinick.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springguru.chumick.sfgpetclinick.model.Owner;
import org.springguru.chumick.sfgpetclinick.model.Pet;
import org.springguru.chumick.sfgpetclinick.service.OwnerService;
import org.springguru.chumick.sfgpetclinick.service.PetService;
import org.springguru.chumick.sfgpetclinick.service.PetTypeService;

import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;

@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapSerive<Owner, Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner save(Owner owner) {
        if (owner == null || owner.getPets() == null) {
            return null;
        }

        owner.getPets().forEach(pet -> {
            if (pet.getPetType() != null) {
                if (pet.getPetType().getId() == null) {
                    pet.setPetType(petTypeService.save(pet.getPetType()));
                }
            } else {
                throw new IllegalArgumentException("Pet Type should be specified");
            }

            if (pet.getId() == null) {
                Pet savedPet = petService.save(pet);
                pet.setId(savedPet.getId());
            }
        });

        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Owner> findBy(Predicate<Owner> ownerPredicate) {
        return super.findBy(ownerPredicate);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return findBy(o -> Objects.equals(o.getLastName(), lastName))
            .stream().findFirst().orElse(null);
    }
}

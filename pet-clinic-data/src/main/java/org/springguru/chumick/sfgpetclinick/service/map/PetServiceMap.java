package org.springguru.chumick.sfgpetclinick.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springguru.chumick.sfgpetclinick.model.Pet;
import org.springguru.chumick.sfgpetclinick.service.CrudService;
import org.springguru.chumick.sfgpetclinick.service.PetService;

import java.util.Set;
import java.util.function.Predicate;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapSerive<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Set<Pet> findBy(Predicate<Pet> ownerPredicate) {
        return super.findBy(ownerPredicate);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

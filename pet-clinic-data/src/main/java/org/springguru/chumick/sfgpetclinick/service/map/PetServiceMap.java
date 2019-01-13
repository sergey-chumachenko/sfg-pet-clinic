package org.springguru.chumick.sfgpetclinick.service.map;

import org.springguru.chumick.sfgpetclinick.model.Pet;
import org.springguru.chumick.sfgpetclinick.service.CrudService;

import java.util.Set;
import java.util.function.Predicate;

public class PetServiceMap extends AbstractMapSerive<Pet, Long> implements CrudService<Pet, Long> {
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

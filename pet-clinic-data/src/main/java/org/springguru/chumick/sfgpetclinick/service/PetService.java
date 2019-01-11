package org.springguru.chumick.sfgpetclinick.service;

import org.springguru.chumick.sfgpetclinick.model.Pet;

import java.util.Set;
import java.util.function.Predicate;

public interface PetService {
    Pet findBy(Predicate<Pet> petPredicate);
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}

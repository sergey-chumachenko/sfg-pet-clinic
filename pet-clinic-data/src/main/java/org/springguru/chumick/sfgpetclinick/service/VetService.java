package org.springguru.chumick.sfgpetclinick.service;

import org.springguru.chumick.sfgpetclinick.model.Vet;

import java.util.Set;
import java.util.function.Predicate;

public interface VetService {
    Vet findBy(Predicate<Vet> vetPredicate);
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}

package org.springguru.chumick.sfgpetclinick.service;

import org.springguru.chumick.sfgpetclinick.model.Owner;

import java.util.Set;
import java.util.function.Predicate;

public interface OwnerService {

    Owner findBy(Predicate<Owner> ownerPredicate);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}

package org.springguru.chumick.sfgpetclinick.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springguru.chumick.sfgpetclinick.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

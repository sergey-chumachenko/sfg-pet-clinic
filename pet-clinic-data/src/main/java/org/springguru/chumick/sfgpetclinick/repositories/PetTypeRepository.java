package org.springguru.chumick.sfgpetclinick.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springguru.chumick.sfgpetclinick.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

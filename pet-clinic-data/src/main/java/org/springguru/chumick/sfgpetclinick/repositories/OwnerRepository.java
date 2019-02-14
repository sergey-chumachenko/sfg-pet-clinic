package org.springguru.chumick.sfgpetclinick.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springguru.chumick.sfgpetclinick.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

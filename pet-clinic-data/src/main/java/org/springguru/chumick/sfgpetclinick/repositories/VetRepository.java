package org.springguru.chumick.sfgpetclinick.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springguru.chumick.sfgpetclinick.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

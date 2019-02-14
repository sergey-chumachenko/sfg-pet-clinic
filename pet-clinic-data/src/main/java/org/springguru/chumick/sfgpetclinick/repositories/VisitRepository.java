package org.springguru.chumick.sfgpetclinick.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springguru.chumick.sfgpetclinick.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

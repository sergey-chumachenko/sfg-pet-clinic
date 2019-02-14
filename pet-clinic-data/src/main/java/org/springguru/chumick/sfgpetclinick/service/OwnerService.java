package org.springguru.chumick.sfgpetclinick.service;

import org.springguru.chumick.sfgpetclinick.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}

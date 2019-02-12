package org.springguru.chumick.sfgpetclinick.service.map;

import org.springframework.stereotype.Service;
import org.springguru.chumick.sfgpetclinick.model.Owner;
import org.springguru.chumick.sfgpetclinick.service.CrudService;
import org.springguru.chumick.sfgpetclinick.service.OwnerService;

import java.util.Set;
import java.util.function.Predicate;

@Service
public class OwnerServiceMap extends AbstractMapSerive<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Owner> findBy(Predicate<Owner> ownerPredicate) {
        return super.findBy(ownerPredicate);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

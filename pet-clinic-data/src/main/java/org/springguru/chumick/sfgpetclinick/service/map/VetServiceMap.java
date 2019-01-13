package org.springguru.chumick.sfgpetclinick.service.map;

import org.springguru.chumick.sfgpetclinick.model.Vet;
import org.springguru.chumick.sfgpetclinick.service.CrudService;

import java.util.Set;
import java.util.function.Predicate;

public class VetServiceMap extends AbstractMapSerive<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Vet> findBy(Predicate<Vet> ownerPredicate) {
        return super.findBy(ownerPredicate);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

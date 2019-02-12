package org.springguru.chumick.sfgpetclinick.service.map;

import org.springguru.chumick.sfgpetclinick.model.PetType;
import org.springguru.chumick.sfgpetclinick.service.PetTypeService;

import java.util.Set;
import java.util.function.Predicate;

public class PetTypeMapService extends AbstractMapSerive<PetType, Long> implements PetTypeService {
    @Override
    public PetType save(PetType petType) {
        return super.save(petType.getId(), petType);
    }

    @Override
    public Set<PetType> findBy(Predicate<PetType> petTypePredicate) {
        return super.findBy(petTypePredicate);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

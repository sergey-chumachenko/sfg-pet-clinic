package org.springguru.chumick.sfgpetclinick.service.map;

import org.springframework.stereotype.Service;
import org.springguru.chumick.sfgpetclinick.model.Speciality;
import org.springguru.chumick.sfgpetclinick.model.Speciality;
import org.springguru.chumick.sfgpetclinick.service.SpecialityService;

import java.util.Set;
import java.util.function.Predicate;

@Service
public class SpecialityMapService extends AbstractMapSerive<Speciality, Long> implements SpecialityService {
    @Override
    public Speciality save(Speciality object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Speciality> findBy(Predicate<Speciality> predicate) {
        return super.findBy(predicate);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }    
}

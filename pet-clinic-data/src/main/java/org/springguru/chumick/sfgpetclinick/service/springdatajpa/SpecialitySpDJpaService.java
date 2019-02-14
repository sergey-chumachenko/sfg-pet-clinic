package org.springguru.chumick.sfgpetclinick.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springguru.chumick.sfgpetclinick.model.Speciality;
import org.springguru.chumick.sfgpetclinick.repositories.SpecialityRepository;
import org.springguru.chumick.sfgpetclinick.service.SpecialityService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySpDJpaService implements SpecialityService {
    private final SpecialityRepository specialityRepository;

    public SpecialitySpDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();

        specialityRepository.findAll().forEach(specialities::add);

        return specialities;
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}

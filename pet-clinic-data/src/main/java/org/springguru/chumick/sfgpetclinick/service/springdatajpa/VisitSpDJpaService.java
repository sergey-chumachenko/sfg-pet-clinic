package org.springguru.chumick.sfgpetclinick.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springguru.chumick.sfgpetclinick.model.Visit;
import org.springguru.chumick.sfgpetclinick.repositories.VisitRepository;
import org.springguru.chumick.sfgpetclinick.service.VisitService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSpDJpaService implements VisitService {
    private final VisitRepository visitRepository;

    public VisitSpDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();

        visitRepository.findAll().forEach(visits::add);

        return visits;
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}

package org.springguru.chumick.sfgpetclinick.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springguru.chumick.sfgpetclinick.model.Speciality;
import org.springguru.chumick.sfgpetclinick.model.Vet;
import org.springguru.chumick.sfgpetclinick.service.CrudService;
import org.springguru.chumick.sfgpetclinick.service.SpecialityService;
import org.springguru.chumick.sfgpetclinick.service.VetService;

import java.util.Set;
import java.util.function.Predicate;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapSerive<Vet, Long> implements VetService {
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet vet) {
        if (vet == null || vet.getSpecialities() == null) {
            return null;
        }

        vet.getSpecialities().forEach( s -> {
            if (s.getId() == null) {
                Speciality saved = specialityService.save(s);
                s.setId(saved.getId());
            }
        });

        return super.save(vet.getId(), vet);
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

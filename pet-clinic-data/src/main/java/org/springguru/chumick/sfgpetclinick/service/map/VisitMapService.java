package org.springguru.chumick.sfgpetclinick.service.map;

import org.springframework.stereotype.Service;
import org.springguru.chumick.sfgpetclinick.model.Visit;
import org.springguru.chumick.sfgpetclinick.service.VisitService;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapSerive<Visit, Long> implements VisitService {

    @Override
    public Visit save(Visit visit) {
        return super.save(visit.getId(), visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

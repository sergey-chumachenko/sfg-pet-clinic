package org.springguru.chumick.sfgpetclinick.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Vet extends Person {
    @ManyToMany
    @JoinTable(
        name="vet_speciality",
        joinColumns = @JoinColumn(name="vet_id"),
        inverseJoinColumns = @JoinColumn(name="speciality_id")
    )
    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}

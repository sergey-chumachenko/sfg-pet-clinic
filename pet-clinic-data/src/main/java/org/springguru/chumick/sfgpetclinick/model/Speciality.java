package org.springguru.chumick.sfgpetclinick.model;

import javax.persistence.Entity;

@Entity
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

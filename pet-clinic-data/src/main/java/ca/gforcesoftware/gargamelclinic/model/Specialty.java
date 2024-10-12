package ca.gforcesoftware.gargamelclinic.model;

import jakarta.persistence.*;
import lombok.Cleanup;

/**
 * @author gavinhashemi on 2024-10-09
 */
@Entity
@Table(name="specialities")
public class Specialty extends BaseEntity{

    @Column(name="description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

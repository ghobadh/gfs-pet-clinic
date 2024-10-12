package ca.gforcesoftware.gargamelclinic.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;

/**
 * @author gavinhashemi on 2024-10-09
 */
@Entity
@Table(name="visit")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "ped_id")
    private Pet pet;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

package ca.gforcesoftware.gargamelclinic.model;

import java.time.LocalDateTime;

/**
 * @author gavinhashemi on 2024-10-09
 */
public class Visit extends BaseEntity {
    private LocalDateTime date;
    private String description;
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

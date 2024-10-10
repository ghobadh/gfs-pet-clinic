package ca.gforcesoftware.gargamelclinic.model;

/**
 * @author gavinhashemi on 2024-10-09
 */
public class Specialty extends BaseEntity{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

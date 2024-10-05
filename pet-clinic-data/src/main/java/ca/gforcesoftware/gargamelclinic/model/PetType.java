package ca.gforcesoftware.gargamelclinic.model;

/**
 * @author gavinhashemi on 2024-10-04
 */
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

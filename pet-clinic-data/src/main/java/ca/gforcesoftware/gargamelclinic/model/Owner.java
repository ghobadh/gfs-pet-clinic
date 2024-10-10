package ca.gforcesoftware.gargamelclinic.model;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-04
 */
public class Owner extends Person{
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

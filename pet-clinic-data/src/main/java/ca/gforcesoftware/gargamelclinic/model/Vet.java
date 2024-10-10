package ca.gforcesoftware.gargamelclinic.model;

import java.util.HashSet;
import java.util.Set;
/**
 * @author gavinhashemi on 2024-10-04
 */
public class Vet extends Person{
    private Set<Speciality> specialities =  new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}

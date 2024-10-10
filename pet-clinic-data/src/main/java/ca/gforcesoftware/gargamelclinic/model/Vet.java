package ca.gforcesoftware.gargamelclinic.model;

import java.util.Set;
/**
 * @author gavinhashemi on 2024-10-04
 */
public class Vet extends Person{
    private Set<Speciality> specialities ;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}

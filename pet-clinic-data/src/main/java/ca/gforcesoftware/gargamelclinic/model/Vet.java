package ca.gforcesoftware.gargamelclinic.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
/**
 * @author gavinhashemi on 2024-10-04
 */
/*
For sake of issue with @EqualAndHashCode in @Data, I decide to put in this way
 */
@ToString
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="vets")
public class Vet extends Person{

    /*
    When you define many to many relationship by default the relationship fetch is lazy but in here in explicitly as to fetch it eager
    Note: since Person class is inherited from baseEntity class and we define ID over there. So in here for JoinTable we don't need to re-define it.
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name ="vets_specialties"
            , joinColumns = @JoinColumn(name = "vet_id" )
            , inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties =  new HashSet<>();

}

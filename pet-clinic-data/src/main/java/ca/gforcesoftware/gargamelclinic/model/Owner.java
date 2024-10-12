package ca.gforcesoftware.gargamelclinic.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-04
 */
/*
For sake of issue with @EqualAndHashCode in @Data, I decide to put in this way.
For Owner in order to see first and last name, I have to remove @AllArgConstructor and move @Builder to the manual Constructor I have created.
 */
@ToString
@Setter
@Getter

@NoArgsConstructor
@Entity
@Table(name="owners")
public class Owner extends Person{

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @Column(name="pets")
    private Set<Pet> pets = new HashSet<>();

}

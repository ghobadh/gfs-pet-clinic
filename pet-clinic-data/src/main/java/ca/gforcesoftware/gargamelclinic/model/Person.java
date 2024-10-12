package ca.gforcesoftware.gargamelclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author gavinhashemi on 2024-10-04
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person  extends BaseEntity{
    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;


}

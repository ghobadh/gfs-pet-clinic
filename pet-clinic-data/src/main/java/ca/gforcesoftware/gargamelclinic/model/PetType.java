package ca.gforcesoftware.gargamelclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

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
@Table(name="types")
public class PetType extends BaseEntity {
    @Column(name="name")
    private String name;

}

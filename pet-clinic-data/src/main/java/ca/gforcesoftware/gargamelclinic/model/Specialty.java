package ca.gforcesoftware.gargamelclinic.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author gavinhashemi on 2024-10-09
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
@Table(name="specialities")
public class Specialty extends BaseEntity{

    @Column(name="description")
    private String description;

}

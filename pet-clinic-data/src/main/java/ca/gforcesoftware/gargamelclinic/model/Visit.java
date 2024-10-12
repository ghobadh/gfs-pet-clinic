package ca.gforcesoftware.gargamelclinic.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;

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
@Table(name="visit")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "ped_id")
    private Pet pet;

}

package ru.competencies.task.constructor.adapter.persistence.postgres.entities;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "PROGRAM")
@EqualsAndHashCode(exclude = {"specialty"})
@ToString(exclude = {"specialty"})
public class ProgramEntity {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private UUID id;

    @Column(name = "TITLE", nullable = false)
    private String title;


    @Column(name = "TITLE", nullable = false)
    private String code;

    @ManyToOne
    @JoinColumn(name = "SPECIALTY_ID", nullable = false)
    private SpecialtyEntity specialty;

}

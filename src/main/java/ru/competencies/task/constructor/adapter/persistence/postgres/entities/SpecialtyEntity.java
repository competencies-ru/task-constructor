package ru.competencies.task.constructor.adapter.persistence.postgres.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "SPECIALTY")
@EqualsAndHashCode(exclude = {"programs", "ugsn"})
@ToString(exclude = {"programs", "ugsn"})
public class SpecialtyEntity {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private UUID id;

    @Column(name = "TITLE", nullable = false)
    private String title;


    @Column(name = "TITLE", nullable = false)
    private String code;

    @OneToMany(mappedBy = "specialty", fetch = FetchType.LAZY)
    private List<ProgramEntity> programs;

    @ManyToOne
    @JoinColumn(name = "ugsn_id", nullable = false)
    private UgsnEntity ugsn;
}

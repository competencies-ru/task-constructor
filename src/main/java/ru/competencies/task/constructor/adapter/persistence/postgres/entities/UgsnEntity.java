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
@Table(name = "UGSN")
@EqualsAndHashCode(exclude = {"specialties", "level"})
@ToString(exclude = {"specialties", "level"})
public class UgsnEntity {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private UUID id;

    @Column(name = "TITLE", nullable = false)
    private String title;


    @Column(name = "TITLE", nullable = false)
    private String code;

    @OneToMany(mappedBy = "ugsn", fetch = FetchType.LAZY)
    private List<SpecialtyEntity> specialties;

    @ManyToOne
    @JoinColumn(name = "level_id", nullable = false)
    private LevelEntity level;
}

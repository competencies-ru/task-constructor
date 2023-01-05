package ru.competencies.task.constructor.adapter.persistence.postgres.entities;

import lombok.*;
import ru.competencies.task.constructor.core.entity.education.Ugsn;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "LEVEL")
@EqualsAndHashCode(exclude = {"ugsns"})
@ToString(exclude = {"ugsns"})
public class LevelEntity {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private UUID id;

    @Column(name = "TITLE", nullable = false, unique = true)
    private String title;

    @OneToMany(mappedBy = "level", fetch = FetchType.LAZY)
    private List<UgsnEntity> ugsns;

}

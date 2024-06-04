package org.projectx.entity.data;

import jakarta.persistence.*;
import org.projectx.entity.projects.Project;

@Entity
@Table(name="tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tagName;

    @ManyToOne
    private Project project;
}

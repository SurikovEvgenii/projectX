package org.projectx.entity.data;

import jakarta.persistence.*;
import lombok.Data;
import org.projectx.entity.projects.Project;
import java.util.Set;

/**
 *
 */

@Data
@Entity
@Table(name = "style_tags")
public class StyleTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String tagName;

    @OneToMany(mappedBy = "tag")
    private Set<Project> project;
}

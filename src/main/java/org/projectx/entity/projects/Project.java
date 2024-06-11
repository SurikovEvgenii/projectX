package org.projectx.entity.projects;

import jakarta.persistence.*;
import lombok.Data;
import org.projectx.entity.accounts.DesignerAccount;
import org.projectx.entity.data.Comment;
import org.projectx.entity.data.Photo;
import org.projectx.entity.data.StyleTag;

import java.util.Set;

/**
 * Сущность описывающая проект
 */

@Data
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 120, nullable = false)
    private String header;

    @Column(length = 1000, columnDefinition = "TEXT")
    private String description;

    @Column(length = 200, columnDefinition = "TEXT")
    private String shortDescription;

    private Long likesCount;

    @OneToMany(mappedBy = "project")
    private Set<Photo> photoSet;

    @OneToMany(mappedBy = "project")
    private Set<Comment> commentSet;

    @ManyToOne
    private DesignerAccount designer;

    @ManyToOne
    private StyleTag tag;

}

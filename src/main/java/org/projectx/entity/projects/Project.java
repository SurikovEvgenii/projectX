package org.projectx.entity.projects;

import jakarta.persistence.*;
import org.projectx.entity.accounts.Designer;
import org.projectx.entity.data.Comment;
import org.projectx.entity.data.Photo;

import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 120, nullable = false)
    private String header;
    @Column(length = 1000)
    private String description;
    @Column(length = 200)
    private String shortDescription;
    @Column
    private Long rating;
    @OneToMany(mappedBy = "project")
    private Set<Photo> photoSet;
    @OneToMany(mappedBy = "project")
    private Set<Comment> commentSet;
    @ManyToOne
    private Designer designerId;

}

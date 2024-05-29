package org.projectx.entity.data;

import jakarta.persistence.*;
import org.projectx.entity.accounts.User;
import org.projectx.entity.projects.Project;

import java.util.Objects;
import java.util.Set;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    @ManyToOne
    private Project project;
    @ManyToOne
    private User user;


}

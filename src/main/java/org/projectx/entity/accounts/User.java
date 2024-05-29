package org.projectx.entity.accounts;

import jakarta.persistence.*;
import org.projectx.entity.data.Comment;

import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String login;
    @Column(length = 30, nullable = false)
    private String name;
    @Column(length = 30, nullable = false)
    private String surname;
    @Column(length = 12, nullable = false)
    private String number;
    @Column(nullable = false)
    private String email;

    //private Set<Designer> designerSet;
    @OneToMany(mappedBy = "user")
    private Set<Comment> commentSet;

}

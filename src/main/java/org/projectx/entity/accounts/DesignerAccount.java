package org.projectx.entity.accounts;

import jakarta.persistence.*;
import org.projectx.entity.projects.Project;

import java.util.Set;

@Entity
@Table(name="designers")
public class DesignerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    private String telegram;

    private String whatsapp;

    private Long countFollowers;

    @OneToMany(mappedBy = "id")
    private Set<Project> projectSet;

    @ManyToOne
    private UserAccount userAccount;
}

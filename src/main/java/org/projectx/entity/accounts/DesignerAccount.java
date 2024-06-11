package org.projectx.entity.accounts;

import jakarta.persistence.*;
import lombok.Data;
import org.projectx.entity.projects.Project;

import java.util.Objects;
import java.util.Set;

/**
 *
 */


@Data
@Entity
@Table(name="designers")
public class DesignerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

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

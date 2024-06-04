package org.projectx.entity.accounts;

import jakarta.persistence.*;
import org.projectx.entity.data.Comment;
import org.projectx.entity.data.Role;
import org.projectx.entity.projects.Project;

import java.util.Set;

@Entity
@Table(name="user_accounts")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
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
    @OneToMany(mappedBy = "id")
    private Set<Comment> commentSet;
    private boolean admin;
    @OneToMany(mappedBy = "id")
    private Set<Project> projectSet;
    @OneToMany(mappedBy = "id")
    private Set<DesignerAccount> designerAccounts;
    @OneToOne
    private Role role;

}

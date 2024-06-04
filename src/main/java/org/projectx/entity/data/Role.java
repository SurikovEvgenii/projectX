package org.projectx.entity.data;

import jakarta.persistence.*;
import org.projectx.entity.accounts.UserAccount;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String role;
}

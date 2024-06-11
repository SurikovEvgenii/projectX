package org.projectx.entity.data;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 */

@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;
}

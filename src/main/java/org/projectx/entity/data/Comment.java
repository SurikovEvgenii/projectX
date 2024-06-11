package org.projectx.entity.data;

import jakarta.persistence.*;
import lombok.Data;
import org.projectx.entity.accounts.UserAccount;
import org.projectx.entity.projects.Project;

/**
 *
 */

@Data
@Entity
@Table(name="comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String text;

    @ManyToOne
    private Project project;

    @ManyToOne
    private UserAccount userAccount;
}

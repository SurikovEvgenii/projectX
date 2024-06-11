package org.projectx.entity.data;

import jakarta.persistence.*;
import lombok.Data;
import org.projectx.entity.projects.Project;

/**
 *
 */

@Data
@Entity
@Table(name="photos")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String url;

    @ManyToOne
    private Project project;
}

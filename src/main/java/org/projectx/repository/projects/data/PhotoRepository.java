package org.projectx.repository.projects.data;

import org.projectx.entity.projects.data.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}

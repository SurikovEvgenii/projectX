package org.projectx.repository.projects.data;

import org.projectx.entity.projects.data.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

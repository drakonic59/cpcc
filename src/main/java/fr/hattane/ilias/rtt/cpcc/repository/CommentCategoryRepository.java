package fr.hattane.ilias.rtt.cpcc.repository;

import fr.hattane.ilias.rtt.cpcc.entity.CommentCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentCategoryRepository extends JpaRepository<CommentCategory, Long> {
}


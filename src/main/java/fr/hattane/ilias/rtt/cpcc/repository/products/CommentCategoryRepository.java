package fr.hattane.ilias.rtt.cpcc.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.products.CommentCategory;

@Repository
public interface CommentCategoryRepository extends JpaRepository<CommentCategory, Long> {
}


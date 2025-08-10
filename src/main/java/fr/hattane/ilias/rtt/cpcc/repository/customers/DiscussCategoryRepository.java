package fr.hattane.ilias.rtt.cpcc.repository.customers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.customers.DiscussCategory;

@Repository
public interface DiscussCategoryRepository extends JpaRepository<DiscussCategory, Long> {
}


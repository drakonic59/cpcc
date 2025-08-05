package fr.hattane.ilias.rtt.cpcc.repository;

import fr.hattane.ilias.rtt.cpcc.entity.DiscussSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussSourceRepository extends JpaRepository<DiscussSource, Long> {
}


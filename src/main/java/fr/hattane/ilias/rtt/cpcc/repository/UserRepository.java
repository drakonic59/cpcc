package fr.hattane.ilias.rtt.cpcc.repository;

import fr.hattane.ilias.rtt.cpcc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}


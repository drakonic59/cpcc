package fr.hattane.ilias.rtt.cpcc.repository;

import fr.hattane.ilias.rtt.cpcc.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {
}


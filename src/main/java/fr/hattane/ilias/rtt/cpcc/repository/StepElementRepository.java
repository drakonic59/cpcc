package fr.hattane.ilias.rtt.cpcc.repository;

import fr.hattane.ilias.rtt.cpcc.entity.StepElement;
import fr.hattane.ilias.rtt.cpcc.entity.StepElementId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepElementRepository extends JpaRepository<StepElement, StepElementId> {
}


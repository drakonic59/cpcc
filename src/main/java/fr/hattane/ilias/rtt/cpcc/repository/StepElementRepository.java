package fr.hattane.ilias.rtt.cpcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.products.StepElement;
import fr.hattane.ilias.rtt.cpcc.entity.products.StepElementId;

@Repository
public interface StepElementRepository extends JpaRepository<StepElement, StepElementId> {
}


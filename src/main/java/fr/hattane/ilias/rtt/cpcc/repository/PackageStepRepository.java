package fr.hattane.ilias.rtt.cpcc.repository;

import fr.hattane.ilias.rtt.cpcc.entity.PackageStep;
import fr.hattane.ilias.rtt.cpcc.entity.PackageStepId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageStepRepository extends JpaRepository<PackageStep, PackageStepId> {
}


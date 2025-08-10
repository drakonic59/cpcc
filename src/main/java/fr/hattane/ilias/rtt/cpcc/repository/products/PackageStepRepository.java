package fr.hattane.ilias.rtt.cpcc.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.products.PackageStep;
import fr.hattane.ilias.rtt.cpcc.entity.products.PackageStepId;

@Repository
public interface PackageStepRepository extends JpaRepository<PackageStep, PackageStepId> {
}


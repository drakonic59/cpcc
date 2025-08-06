package fr.hattane.ilias.rtt.cpcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.products.PackageEntity;

@Repository
public interface PackageRepository extends JpaRepository<PackageEntity, Long> {
}


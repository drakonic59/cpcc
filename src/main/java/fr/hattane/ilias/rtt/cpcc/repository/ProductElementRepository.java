package fr.hattane.ilias.rtt.cpcc.repository;

import fr.hattane.ilias.rtt.cpcc.entity.ProductElement;
import fr.hattane.ilias.rtt.cpcc.entity.ProductElementId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductElementRepository extends JpaRepository<ProductElement, ProductElementId> {
}


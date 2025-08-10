package fr.hattane.ilias.rtt.cpcc.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.products.ProductElement;
import fr.hattane.ilias.rtt.cpcc.entity.products.ProductElementId;

@Repository
public interface ProductElementRepository extends JpaRepository<ProductElement, ProductElementId> {
}


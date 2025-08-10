package fr.hattane.ilias.rtt.cpcc.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.products.Element;

@Repository
public interface ElementRepository extends JpaRepository<Element, Long> {
}


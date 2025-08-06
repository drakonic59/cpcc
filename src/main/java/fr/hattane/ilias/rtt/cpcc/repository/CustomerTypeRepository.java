package fr.hattane.ilias.rtt.cpcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.customers.CustomerType;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {
}


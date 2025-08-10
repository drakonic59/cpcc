package fr.hattane.ilias.rtt.cpcc.repository.customers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}


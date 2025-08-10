package fr.hattane.ilias.rtt.cpcc.repository.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.orders.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

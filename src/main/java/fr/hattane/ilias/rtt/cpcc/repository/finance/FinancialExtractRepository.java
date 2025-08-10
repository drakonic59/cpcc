package fr.hattane.ilias.rtt.cpcc.repository.finance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hattane.ilias.rtt.cpcc.entity.finance.FinancialExtract;

@Repository
public interface FinancialExtractRepository extends JpaRepository<FinancialExtract, Long> {
}

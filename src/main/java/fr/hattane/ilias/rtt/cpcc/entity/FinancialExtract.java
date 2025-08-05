package fr.hattane.ilias.rtt.cpcc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FinancialExtracts")
public class FinancialExtract {
    @Id
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "date_from")
    private LocalDateTime dateFrom;

    @Column(name = "date_to")
    private LocalDateTime dateTo;

    @ManyToOne
    @JoinColumn(name = "file_pdf")
    private FileEntity filePdf;

    @Column(name = "pay_full")
    private Double payFull;

    @Column(name = "pay_taxes")
    private Double payTaxes;

    @Column(name = "gain_full")
    private Double gainFull;

    @Column(name = "gain_rest")
    private Double gainRest;

    @Column(name = "pay_materials")
    private Double payMaterials;

    @Column(name = "pay_transport")
    private Double payTransport;

    @Column(name = "pay_employees")
    private Double payEmployees;

    @Column(name = "pay_production")
    private Double payProduction;

    @Column(name = "pay_loose")
    private Double payLoose;

    @Column(name = "items_producted")
    private Integer itemsProducted;

    @Column(name = "items_loosed")
    private Integer itemsLoosed;

    @Column(name = "items_sold")
    private Integer itemsSold;
}

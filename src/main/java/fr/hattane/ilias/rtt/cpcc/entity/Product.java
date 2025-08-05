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
@Table(name = "Products")
public class Product {
    @Id
    private Long id;

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    private Integer version;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "production_price")
    private Double productionPrice;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private Long createdBy;
}

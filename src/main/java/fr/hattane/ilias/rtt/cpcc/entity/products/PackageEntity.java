package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import fr.hattane.ilias.rtt.cpcc.entity.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Package")
public class PackageEntity {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "index")
    private Integer index;
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
    private Integer quantity;
    @Column(name = "rest_quantity")
    private Integer restQuantity;
    @Column(name = "complete_sell")
    private Boolean completeSell;
    private Double price;
    @Column(name = "production_started_at")
    private LocalDateTime productionStartedAt;
    @Column(name = "production_started_where")
    private String productionStartedWhere;
    @Column(name = "production_ended_at")
    private LocalDateTime productionEndedAt;
    @Column(name = "production_ended_where")
    private String productionEndedWhere;
    @Column(name = "got_at")
    private LocalDateTime gotAt;
    @Column(name = "got_where")
    private String gotWhere;
    @Column(name = "got_quantity")
    private Integer gotQuantity;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @OneToMany(mappedBy = "packageEntity")
    private Set<PackageStep> steps = new HashSet<>();
}

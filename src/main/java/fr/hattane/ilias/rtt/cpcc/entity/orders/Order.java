package fr.hattane.ilias.rtt.cpcc.entity.orders;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Customer;
import fr.hattane.ilias.rtt.cpcc.entity.products.Product;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Orders")
public class Order {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Boolean gift;

    @Column(columnDefinition = "text")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "ordered_by")
    private Customer orderedBy;

    @Column(name = "ordered_at")
    private LocalDateTime orderedAt;

    private Integer quantity;

    @Column(name = "need_production")
    private Boolean needProduction;

    private Double price;

    private String address;

    @Column(name = "production_started_at")
    private LocalDateTime productionStartedAt;

    @Column(name = "production_ended_at")
    private LocalDateTime productionEndedAt;

    @Column(name = "sended_at")
    private LocalDateTime sendedAt;

    @Column(name = "transit_ended_at")
    private LocalDateTime transitEndedAt;

    @Column(name = "delivered_at")
    private LocalDateTime deliveredAt;

    @Column(name = "done_at")
    private LocalDateTime doneAt;

    @Column(name = "delivered_by")
    private String deliveredBy;

    private String location;

    @ManyToMany
    @JoinTable(name = "OrderUnits",
            joinColumns = @JoinColumn(name = "order"),
            inverseJoinColumns = @JoinColumn(name = "unit"))
    private Set<Unit> units = new HashSet<>();
}

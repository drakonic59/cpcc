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
@Table(name = "Orders")
public class Order {
    @Id
    private Long id;

    private Boolean gift;

    @Column(columnDefinition = "text")
    private String comment;

    private Long product;

    @Column(name = "ordered_by")
    private Long orderedBy;

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
}

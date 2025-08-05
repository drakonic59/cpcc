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
@Table(name = "Bills")
public class Bill {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "order")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    private Double price;
    private Double tva;
    @ManyToOne
    @JoinColumn(name = "file_pdf")
    private FileEntity filePdf;
}

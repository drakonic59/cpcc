package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ProductElements")
@IdClass(ProductElementId.class)
public class ProductElement {
    @Id
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "element")
    private Element element;

    private Integer quantity;
}

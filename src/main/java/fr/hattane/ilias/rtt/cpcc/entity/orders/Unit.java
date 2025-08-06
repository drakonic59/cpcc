package fr.hattane.ilias.rtt.cpcc.entity.orders;

import fr.hattane.ilias.rtt.cpcc.entity.products.PackageEntity;
import fr.hattane.ilias.rtt.cpcc.entity.products.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Unit")
public class Unit {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "package_id")
    private PackageEntity packageEntity;
    private String reference;
    private Boolean loosed;
}

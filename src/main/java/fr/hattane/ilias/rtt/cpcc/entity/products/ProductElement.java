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

	public ProductElement() {
		super();
	}

	public ProductElement(Product product, Element element, Integer quantity) {
		super();
		this.product = product;
		this.element = element;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
    
}

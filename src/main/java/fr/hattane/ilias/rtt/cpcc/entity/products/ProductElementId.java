package fr.hattane.ilias.rtt.cpcc.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductElementId implements Serializable {
	
    private Long product;
    private Long element;
    
    public ProductElementId() {
		super();
	}

	public ProductElementId(Long product, Long element) {
    	this.product = product;
    	this.element = element;
    }

	public Long getProduct() {
		return product;
	}

	public void setProduct(Long product) {
		this.product = product;
	}

	public Long getElement() {
		return element;
	}

	public void setElement(Long element) {
		this.element = element;
	}
    
}

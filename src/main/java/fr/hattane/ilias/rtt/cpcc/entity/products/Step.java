package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Steps")
public class Step {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
    
    @Column(name = "step_index")
    private Integer stepIndex;

	public Step() {
		super();
	}

	public Step(Long id, String name, String description, Product product, Integer stepIndex) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.product = product;
		this.stepIndex = stepIndex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getStepIndex() {
		return stepIndex;
	}

	public void setStepIndex(Integer stepIndex) {
		this.stepIndex = stepIndex;
	}
    
}

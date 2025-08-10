package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "StepElements")
@IdClass(StepElementId.class)
public class StepElement {
	
    @Id
    @ManyToOne
    @JoinColumn(name = "step")
    private Step step;

    @Id
    @ManyToOne
    @JoinColumn(name = "element")
    private Element element;

    private Integer quantity;

	public StepElement() {
		super();
	}

	public StepElement(Step step, Element element, Integer quantity) {
		super();
		this.step = step;
		this.element = element;
		this.quantity = quantity;
	}

	public Step getStep() {
		return step;
	}

	public void setStep(Step step) {
		this.step = step;
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

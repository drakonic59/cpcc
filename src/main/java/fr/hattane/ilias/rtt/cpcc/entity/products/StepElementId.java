package fr.hattane.ilias.rtt.cpcc.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StepElementId implements Serializable {
	
    private Long step;
    private Long element;
    
    public StepElementId() {
		super();
	}

	public StepElementId(Long step, Long element) {
    	this.step = step;
    	this.element = element;
    }

	public Long getStep() {
		return step;
	}

	public void setStep(Long step) {
		this.step = step;
	}

	public Long getElement() {
		return element;
	}

	public void setElement(Long element) {
		this.element = element;
	}
    
}

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
    
    public StepElementId(Long step, Long element) {
    	this.step = step;
    	this.element = element;
    }
}

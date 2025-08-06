package fr.hattane.ilias.rtt.cpcc.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackageStepId implements Serializable {
    private Long packageEntity;
    private Long step;
    
    public PackageStepId(Long packageEntity, Long step) {
    	this.packageEntity = packageEntity;
    	this.step = step;
    }
}

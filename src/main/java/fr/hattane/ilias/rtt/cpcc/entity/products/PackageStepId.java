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

	public PackageStepId() {
		super();
	}
    
    public PackageStepId(Long packageEntity, Long step) {
    	this.packageEntity = packageEntity;
    	this.step = step;
    }

	public Long getPackageEntity() {
		return packageEntity;
	}

	public void setPackageEntity(Long packageEntity) {
		this.packageEntity = packageEntity;
	}

	public Long getStep() {
		return step;
	}

	public void setStep(Long step) {
		this.step = step;
	}
    
}

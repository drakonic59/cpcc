package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PackageSteps")
@IdClass(PackageStepId.class)
public class PackageStep {
	
    @Id
    @ManyToOne
    @JoinColumn(name = "package_id")
    private PackageEntity packageEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "step_id")
    private Step step;

    @Column(name = "started_at")
    private LocalDateTime startedAt;
    @Column(name = "ended_at")
    private LocalDateTime endedAt;
    
	public PackageStep() {
		super();
	}

	public PackageStep(PackageEntity packageEntity, Step step, LocalDateTime startedAt, LocalDateTime endedAt) {
		super();
		this.packageEntity = packageEntity;
		this.step = step;
		this.startedAt = startedAt;
		this.endedAt = endedAt;
	}

	public PackageEntity getPackageEntity() {
		return packageEntity;
	}

	public void setPackageEntity(PackageEntity packageEntity) {
		this.packageEntity = packageEntity;
	}

	public Step getStep() {
		return step;
	}

	public void setStep(Step step) {
		this.step = step;
	}

	public LocalDateTime getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(LocalDateTime startedAt) {
		this.startedAt = startedAt;
	}

	public LocalDateTime getEndedAt() {
		return endedAt;
	}

	public void setEndedAt(LocalDateTime endedAt) {
		this.endedAt = endedAt;
	}
    
}

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
}

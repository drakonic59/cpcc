package fr.hattane.ilias.rtt.cpcc.entity;

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
}

package fr.hattane.ilias.rtt.cpcc.entity;

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
}

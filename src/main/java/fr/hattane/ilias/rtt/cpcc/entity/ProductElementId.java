package fr.hattane.ilias.rtt.cpcc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductElementId implements Serializable {
    private Long product;
    private Long element;
}

package fr.hattane.ilias.rtt.cpcc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Elements")
public class Element {
    @Id
    private Long id;
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    private Double price;
    private String unit;
}

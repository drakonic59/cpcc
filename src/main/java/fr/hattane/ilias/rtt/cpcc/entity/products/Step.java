package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Steps")
public class Step {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
    @Column(name = "step_index")
    private Integer stepIndex;
}

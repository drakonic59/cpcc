package fr.hattane.ilias.rtt.cpcc.entity.customers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Address")
public class Address {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String land;
    private String city;
    private String street;
    private String number;
    @Column(columnDefinition = "text")
    private String more;
}

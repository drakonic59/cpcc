package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import fr.hattane.ilias.rtt.cpcc.entity.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Bugs")
public class Bug {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "package_id")
    private PackageEntity packageEntity;
    @Column(columnDefinition = "text")
    private String source;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
}

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

	public Bug() {
		super();
	}

	public Bug(Long id, String name, String description, Product product, PackageEntity packageEntity, String source,
			LocalDateTime createdAt, User createdBy) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.product = product;
		this.packageEntity = packageEntity;
		this.source = source;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public PackageEntity getPackageEntity() {
		return packageEntity;
	}

	public void setPackageEntity(PackageEntity packageEntity) {
		this.packageEntity = packageEntity;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
    
}

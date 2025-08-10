package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import fr.hattane.ilias.rtt.cpcc.entity.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Package")
public class PackageEntity {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "package_index")
    private Integer packageIndex;
    
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
    private Integer quantity;
    
    @Column(name = "rest_quantity")
    private Integer restQuantity;
    
    @Column(name = "complete_sell")
    private Boolean completeSell;
    
    private Double price;
    
    @Column(name = "production_started_where")
    private String productionStartedWhere;
    @Column(name = "production_ended_where")
    private String productionEndedWhere;
    
    @Column(name = "production_started_at")
    private LocalDateTime productionStartedAt;
    @Column(name = "production_ended_at")
    private LocalDateTime productionEndedAt;
    @Column(name = "got_at")
    private LocalDateTime gotAt;
    
    @Column(name = "got_where")
    private String gotWhere;
    @Column(name = "got_quantity")
    private Integer gotQuantity;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @OneToMany(mappedBy = "packageEntity")
    private Set<PackageStep> steps = new HashSet<>();

	public PackageEntity() {
		super();
	}

	public PackageEntity(Long id, Integer packageIndex, String name, String description, Product product,
			Integer quantity, Integer restQuantity, Boolean completeSell, Double price, String productionStartedWhere,
			String productionEndedWhere, LocalDateTime productionStartedAt, LocalDateTime productionEndedAt,
			LocalDateTime gotAt, String gotWhere, Integer gotQuantity, LocalDateTime createdAt, User createdBy,
			Set<PackageStep> steps) {
		super();
		this.id = id;
		this.packageIndex = packageIndex;
		this.name = name;
		this.description = description;
		this.product = product;
		this.quantity = quantity;
		this.restQuantity = restQuantity;
		this.completeSell = completeSell;
		this.price = price;
		this.productionStartedWhere = productionStartedWhere;
		this.productionEndedWhere = productionEndedWhere;
		this.productionStartedAt = productionStartedAt;
		this.productionEndedAt = productionEndedAt;
		this.gotAt = gotAt;
		this.gotWhere = gotWhere;
		this.gotQuantity = gotQuantity;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.steps = steps;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPackageIndex() {
		return packageIndex;
	}

	public void setPackageIndex(Integer packageIndex) {
		this.packageIndex = packageIndex;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getRestQuantity() {
		return restQuantity;
	}

	public void setRestQuantity(Integer restQuantity) {
		this.restQuantity = restQuantity;
	}

	public Boolean getCompleteSell() {
		return completeSell;
	}

	public void setCompleteSell(Boolean completeSell) {
		this.completeSell = completeSell;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProductionStartedWhere() {
		return productionStartedWhere;
	}

	public void setProductionStartedWhere(String productionStartedWhere) {
		this.productionStartedWhere = productionStartedWhere;
	}

	public String getProductionEndedWhere() {
		return productionEndedWhere;
	}

	public void setProductionEndedWhere(String productionEndedWhere) {
		this.productionEndedWhere = productionEndedWhere;
	}

	public LocalDateTime getProductionStartedAt() {
		return productionStartedAt;
	}

	public void setProductionStartedAt(LocalDateTime productionStartedAt) {
		this.productionStartedAt = productionStartedAt;
	}

	public LocalDateTime getProductionEndedAt() {
		return productionEndedAt;
	}

	public void setProductionEndedAt(LocalDateTime productionEndedAt) {
		this.productionEndedAt = productionEndedAt;
	}

	public LocalDateTime getGotAt() {
		return gotAt;
	}

	public void setGotAt(LocalDateTime gotAt) {
		this.gotAt = gotAt;
	}

	public String getGotWhere() {
		return gotWhere;
	}

	public void setGotWhere(String gotWhere) {
		this.gotWhere = gotWhere;
	}

	public Integer getGotQuantity() {
		return gotQuantity;
	}

	public void setGotQuantity(Integer gotQuantity) {
		this.gotQuantity = gotQuantity;
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

	public Set<PackageStep> getSteps() {
		return steps;
	}

	public void setSteps(Set<PackageStep> steps) {
		this.steps = steps;
	}
    
}

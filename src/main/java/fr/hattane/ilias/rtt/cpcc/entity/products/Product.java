package fr.hattane.ilias.rtt.cpcc.entity.products;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import fr.hattane.ilias.rtt.cpcc.entity.FileEntity;
import fr.hattane.ilias.rtt.cpcc.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
public class Product {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Column(name = "external_link", columnDefinition = "text")
    private String externalLink;

    private Boolean enabled;

    @Column(name = "product_version")
    private Double productVersion;

    private Double pound;

    private Double width;

    private Double height;

    private Double deep;
    
    @ManyToOne
    @JoinColumn(name = "category")
    private ProductCategory category;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "production_price")
    private Double productionPrice;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
    
    @ManyToOne
    @JoinColumn(name = "image")
    private FileEntity image;

    @OneToMany(mappedBy = "product")
    private Set<Step> steps = new HashSet<>();

    @OneToMany(mappedBy = "product")
    private Set<Competition> competitions = new HashSet<>();
    
	public Product() {
		super();
		this.enabled = Boolean.FALSE;
		this.productVersion = Double.valueOf(1.0);
	}

	public Product(Long id, String name, String description, Double productVersion, Double sellPrice, Double productionPrice,
			LocalDateTime createdAt, User createdBy, ProductCategory category, FileEntity image, String externalLink, Double pound,
			Double width, Double height, Double deep) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.productVersion = productVersion;
		this.sellPrice = sellPrice;
		this.productionPrice = productionPrice;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.category = category;
		this.image = image;
		this.externalLink = externalLink;
		this.pound = pound;
		this.width = width;
		this.height = height;
		this.deep = deep;
		this.enabled = false;
	}

	public Product(Long id, String name, String description, Double productVersion, Double sellPrice, Double productionPrice,
			User createdBy, ProductCategory category, FileEntity image, String externalLink, Double pound, Double width, Double height,
			Double deep) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.productVersion = productVersion;
		this.sellPrice = sellPrice;
		this.productionPrice = productionPrice;
		this.createdAt = LocalDateTime.now();
		this.createdBy = createdBy;
		this.category = category;
		this.image = image;
		this.externalLink = externalLink;
		this.pound = pound;
		this.width = width;
		this.height = height;
		this.deep = deep;
		this.enabled = false;
	}

	public Product(String name, String description, Double productVersion, Double sellPrice, Double productionPrice,
			User createdBy, ProductCategory category, FileEntity image, String externalLink, Double pound, Double width, Double height,
			Double deep) {
		super();
		this.name = name;
		this.description = description;
		this.productVersion = productVersion;
		this.sellPrice = sellPrice;
		this.productionPrice = productionPrice;
		this.createdAt = LocalDateTime.now();
		this.createdBy = createdBy;
		this.category = category;
		this.image = image;
		this.externalLink = externalLink;
		this.pound = pound;
		this.width = width;
		this.height = height;
		this.deep = deep;
		this.enabled = false;
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

	public Double getSellPrice() {
		return sellPrice;
	}
	
	public String frontSellPrice() {
		
		String price = "";
		if (sellPrice < 10)
			price += "0";
		
		if (sellPrice < 1)
			price += "0";
		else
			price += (int)(sellPrice/1.0);
				
		if (sellPrice % 1.0 == 0)
			price += ".00";
		else {
			
			String part = sellPrice.toString().substring(("" + (int)(sellPrice/1.0)).length()+1);
			price += "." + part;
			
			if (part.length() == 1)
				price += "0";
			
		}
		return price;
		
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Double getProductionPrice() {
		return productionPrice;
	}

	public void setProductionPrice(Double productionPrice) {
		this.productionPrice = productionPrice;
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

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public Double getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(Double productVersion) {
		this.productVersion = productVersion;
	}

	public FileEntity getImage() {
		return image;
	}

	public void setImage(FileEntity image) {
		this.image = image;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getExternalLink() {
		return externalLink;
	}

	public void setExternalLink(String externalLink) {
		this.externalLink = externalLink;
	}

	public Double getPound() {
		return pound;
	}

	public void setPound(Double pound) {
		this.pound = pound;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getDeep() {
		return deep;
	}

	public void setDeep(Double deep) {
		this.deep = deep;
	}
    
}

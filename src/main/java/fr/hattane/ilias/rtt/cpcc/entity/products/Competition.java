package fr.hattane.ilias.rtt.cpcc.entity.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Competitions")
public class Competition {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
    
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    
    @Column(name = "competition_product")
    private String competitionProduct;
    
    @Column(name = "instagram_link")
    private String instagramLink;
    
    @Column(name = "tiktok_link")
    private String tiktokLink;
    
    @Column(name = "facebook_link")
    private String facebookLink;

	public Competition() {
		super();
	}

	public Competition(Long id, Product product, String name, String description, String competitionProduct,
			String instagramLink, String tiktokLink, String facebookLink) {
		super();
		this.id = id;
		this.product = product;
		this.name = name;
		this.description = description;
		this.competitionProduct = competitionProduct;
		this.instagramLink = instagramLink;
		this.tiktokLink = tiktokLink;
		this.facebookLink = facebookLink;
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

	public String getInstagramLink() {
		return instagramLink;
	}

	public void setInstagramLink(String instagramLink) {
		this.instagramLink = instagramLink;
	}

	public String getTiktokLink() {
		return tiktokLink;
	}

	public void setTiktokLink(String tiktokLink) {
		this.tiktokLink = tiktokLink;
	}

	public String getFacebookLink() {
		return facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getCompetitionProduct() {
		return competitionProduct;
	}

	public void setCompetitionProduct(String competitionProduct) {
		this.competitionProduct = competitionProduct;
	}
    
}

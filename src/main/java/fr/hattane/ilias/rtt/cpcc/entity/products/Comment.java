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
@Table(name = "Comment")
public class Comment {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String mail;
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "category")
    private CommentCategory category;
    
    private String title;
    @Column(columnDefinition = "text")
    private String content;
    
    private Integer score;
    
    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
    
    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
    
    @Column(name = "sended_at")
    private LocalDateTime sendedAt;
    
    @Column(name = "sended_from")
    private String sendedFrom;

	public Comment() {
		super();
	}

	public Comment(Long id, String mail, String name, CommentCategory category, String title, String content,
			Integer score, Product product, User createdBy, LocalDateTime sendedAt, String sendedFrom) {
		super();
		this.id = id;
		this.mail = mail;
		this.name = name;
		this.category = category;
		this.title = title;
		this.content = content;
		this.score = score;
		this.product = product;
		this.createdBy = createdBy;
		this.sendedAt = sendedAt;
		this.sendedFrom = sendedFrom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CommentCategory getCategory() {
		return category;
	}

	public void setCategory(CommentCategory category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getSendedAt() {
		return sendedAt;
	}

	public void setSendedAt(LocalDateTime sendedAt) {
		this.sendedAt = sendedAt;
	}

	public String getSendedFrom() {
		return sendedFrom;
	}

	public void setSendedFrom(String sendedFrom) {
		this.sendedFrom = sendedFrom;
	}
    
}

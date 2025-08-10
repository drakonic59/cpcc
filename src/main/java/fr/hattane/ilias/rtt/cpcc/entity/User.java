package fr.hattane.ilias.rtt.cpcc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String role;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;

	public User() {
		super();
	}

	public User(Long id, String username, String role, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.username = username;
		this.role = role;
		this.createdAt = createdAt;
	}

	public User(Long id, String username, String role) {
		super();
		this.id = id;
		this.username = username;
		this.role = role;
		this.createdAt = LocalDateTime.now();
	}

	public User(String username, String role) {
		super();
		this.username = username;
		this.role = role;
		this.createdAt = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
}

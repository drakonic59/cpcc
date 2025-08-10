package fr.hattane.ilias.rtt.cpcc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Files")
public class FileEntity {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String extension;
    
    @Lob
    private byte[] bytes;

	public FileEntity() {
		super();
	}

	public FileEntity(Long id, String name, String extension, byte[] bytes) {
		super();
		this.id = id;
		this.name = name;
		this.extension = extension;
		this.bytes = bytes;
	}

	public FileEntity(String name, String extension, byte[] bytes) {
		super();
		this.name = name;
		this.extension = extension;
		this.bytes = bytes;
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

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
    
}

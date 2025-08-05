package fr.hattane.ilias.rtt.cpcc.entity;

import jakarta.persistence.Entity;
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
    private Long id;
    private String name;
    private String extension;
    @Lob
    private byte[] bytes;
}

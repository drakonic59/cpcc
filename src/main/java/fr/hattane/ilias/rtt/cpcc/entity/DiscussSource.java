package fr.hattane.ilias.rtt.cpcc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DiscussSources")
public class DiscussSource {
    @Id
    private Long id;
    private String label;
}

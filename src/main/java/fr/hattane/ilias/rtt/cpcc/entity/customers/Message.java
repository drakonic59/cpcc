package fr.hattane.ilias.rtt.cpcc.entity.customers;

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
@Table(name = "Message")
public class Message {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "text")
    private String content;
    @Column(name = "sended_at")
    private LocalDateTime sendedAt;
}

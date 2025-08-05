package fr.hattane.ilias.rtt.cpcc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Comment")
public class Comment {
    @Id
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
}

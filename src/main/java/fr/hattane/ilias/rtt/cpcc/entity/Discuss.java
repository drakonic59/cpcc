package fr.hattane.ilias.rtt.cpcc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Discuss")
public class Discuss {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "source")
    private DiscussSource source;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "category")
    private DiscussCategory category;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
    @Column(name = "ended_at")
    private LocalDateTime endedAt;
    private String title;
    @Column(columnDefinition = "text")
    private String resume;
    @ManyToMany
    @JoinTable(name = "DiscussMessages",
            joinColumns = @JoinColumn(name = "discusss"),
            inverseJoinColumns = @JoinColumn(name = "message"))
    private Set<Message> messages = new HashSet<>();
}

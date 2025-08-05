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
@Table(name = "Customers")
public class Customer {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type")
    private CustomerType type;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String mail;

    private String phone;

    @Column(name = "years_old")
    private Integer yearsOld;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @ManyToOne
    @JoinColumn(name = "gender")
    private Gender gender;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @Column(name = "first_buy_at")
    private LocalDateTime firstBuyAt;

    @Column(name = "last_buy_at")
    private LocalDateTime lastBuyAt;

    @Lob
    @Column(name = "optin_option")
    private byte[] optinOption;

    private Boolean newsletter;

    @Column(columnDefinition = "text")
    private String preferences;

    @ManyToMany
    @JoinTable(name = "CustomerGroups",
            joinColumns = @JoinColumn(name = "customer"),
            inverseJoinColumns = @JoinColumn(name = "group"))
    private Set<GroupEntity> groups = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "CustomerAddress",
            joinColumns = @JoinColumn(name = "customer"),
            inverseJoinColumns = @JoinColumn(name = "address"))
    private Set<Address> addresses = new HashSet<>();
}

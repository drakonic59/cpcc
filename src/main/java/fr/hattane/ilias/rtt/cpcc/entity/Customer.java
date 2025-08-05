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
@Table(name = "Customers")
public class Customer {
    @Id
    private Long id;

    private Long type;

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

    private Long gender;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private Long createdBy;

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
}

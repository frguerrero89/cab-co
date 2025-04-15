package com.ghs.cabco.ms.company.persistance.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This entity represents the database table cabco.company.
 * @author Francisco Javier Guerrero Peláez.
 */
@Entity
@Table(name = "company")
@Getter
@Setter
@NoArgsConstructor
public class Company {
    /** identification. */
    @Id
    @Column(name = "identification")
    private String identification;
    /** socialName. */
    @Column(name = "social_name")
    private String socialName;
    /** displayName. */
    @Column(name = "display_name")
    private String displayName;
    /** secondName. */
    @Column(name = "second_name")
    private String secondName;
    /** lastName. */
    @Column(name = "last_name")
    private String lastName;
    /** secondLastName. */
    @Column(name = "second_last_name")
    private String secondLastName;
    /** mainAddress. */
    @Column(name = "main_address")
    private String mainAddress;
    /** phone. */
    @Column(name = "phone")
    private String phone;
    /** email. */
    @Column(name = "email")
    private String email;
    /** createdAt. */
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    /** isEnabled. */
    @Column(name = "is_enabled")
    private boolean enabled;
}

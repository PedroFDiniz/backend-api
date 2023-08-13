package com.coffeeandsoftware.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.UUID;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(
    name = "user_i",
    uniqueConstraints = {@UniqueConstraint(columnNames = "email")}
)
@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID u_id;

    private String u_name;
    
    @Column(length=320, unique = true)
    private String email;
    private String photoURL;

    @ElementCollection
    @CollectionTable(name  = "followers", joinColumns = @JoinColumn(name = "u_id"))
    private Set<UUID> followers = new HashSet<UUID>(); 

    @OneToMany(mappedBy="author_d", cascade = CascadeType.REMOVE)
    private Set<Denuncia> denuncia = new HashSet<>();



}
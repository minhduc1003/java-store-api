package io.ducozil1003.store.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter @Setter
    private String fullName;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String phone;
    @Getter @Setter
    private String address;
    @Getter @Setter
    private String avatar;
    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @Getter @Setter
    @OneToMany(mappedBy = "user")
    private List<Order> orders;




}

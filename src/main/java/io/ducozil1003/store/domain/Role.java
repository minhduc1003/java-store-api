package io.ducozil1003.store.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter @Setter private String name;
    @Getter @Setter private String description;
    @Getter @Setter
    @OneToMany(mappedBy = "role")
    private List<User> users;
}

package io.ducozil1003.store.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Getter @Setter
    private double totalPrice;
    @Getter @Setter
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
}

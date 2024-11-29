package io.ducozil1003.store.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter @Setter
    private long quantity;
    @Getter @Setter
    private double price;
    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

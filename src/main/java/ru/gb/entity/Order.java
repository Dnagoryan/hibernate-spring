package ru.gb.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "ord")
@NamedQueries({
        @NamedQuery(name = "Order.findById",
                query = "select o from ord o where o.id = :id")
})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ord_id")
    private Long id;



    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH})
    @JoinTable(name ="ord_products",
            joinColumns = @JoinColumn(name = "ord_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;


    @Column (name = "cost")
    private BigDecimal cost;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", products=" + products +
                ", cost=" + cost +
                "}\n";
    }
}

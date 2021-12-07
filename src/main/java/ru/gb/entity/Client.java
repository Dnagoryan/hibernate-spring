package ru.gb.entity;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "client")
@NamedQueries({
        @NamedQuery(name = "Client.findById",
                query = "select c from  client c where c.id = :id")
                })
        public class Client{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "client_name")
        private String clientName;

        @OneToMany(mappedBy = "client",
                cascade = CascadeType.ALL,
                orphanRemoval = true,
                fetch = FetchType.EAGER)
        Set<Order>orders;

        public boolean addOrder(Order order) {
        if(orders==null){
        orders=new HashSet<>();
        }
        return orders.add(order);
        }

//@Override
//public String toString(){
//        return"Client{"+
//        "id="+id+
//        ", clientName='"+clientName+'\''+
//        ", orders="+orders+
//        "}\n";
//        }
        }

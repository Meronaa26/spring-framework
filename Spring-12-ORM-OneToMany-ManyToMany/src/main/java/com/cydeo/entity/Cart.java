package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany
    @JoinTable(name="cart_item_rel" ,
              joinColumns = @JoinColumn(name="c_id"), //changing column name
              inverseJoinColumns = @JoinColumn(name="i_id")) // changing the other tables column name
    private List<Item>items;
}

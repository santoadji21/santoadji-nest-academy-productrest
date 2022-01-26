package com.santoadji21.springnestacademy.presist.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name ="products")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int user_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id")
    private BrandModel brand;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_name")
    private BrandModel brand;

    @Column
    private float price;

    @Column
    private String currency;

    @Column
    private String picture;

    @Column
    private String category;

    @CreationTimestamp
    private String created_at;

    @Column
    private int  quantity;

    @Column
    private Date year;
}

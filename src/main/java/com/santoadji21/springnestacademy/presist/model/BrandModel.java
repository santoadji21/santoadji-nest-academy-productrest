package com.santoadji21.springnestacademy.presist.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@Entity
@Table(name ="brand")
public class BrandModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private int brand_id;

    @Column
    private String brand_ame;
}

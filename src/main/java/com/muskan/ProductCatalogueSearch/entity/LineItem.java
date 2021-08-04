package com.muskan.ProductCatalogueSearch.entity;

import com.muskan.ProductCatalogueSearch.constants.Catagory;
import com.muskan.ProductCatalogueSearch.constants.SizeColorConstants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class LineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String brand;

    @Column
    @OneToOne(mappedBy = )
    Integer price;

    @Column
    SizeColorConstants.Size size;

    @Column
    SizeColorConstants.Color color;

    @Column
    Catagory catagory;

    @Column
    Integer availableStocks;



}

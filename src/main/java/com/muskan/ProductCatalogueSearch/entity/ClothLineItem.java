package com.muskan.ProductCatalogueSearch.entity;

import com.muskan.ProductCatalogueSearch.constants.Catagory;
import com.muskan.ProductCatalogueSearch.constants.SizeColorConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClothLineItem {

    private String Brand;
    private Integer price;
    private SizeColorConstants.Size size;
    private SizeColorConstants.Color color;
    private Catagory catagory;
    private Integer availableStocks;
}

package com.muskan.ProductCatalogueSearch.manager;

import com.muskan.ProductCatalogueSearch.constants.Catagory;
import com.muskan.ProductCatalogueSearch.data.ClothLineItemsDB;
import com.muskan.ProductCatalogueSearch.entity.ClothLineItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductCatalogManager {

    @Autowired
    ClothLineItemsDB clothLineItemsDB;

    List<ClothLineItem> CatagoryList = new ArrayList<>();

    public List<ClothLineItem> getProductByCatagory(Catagory catagory){
        CatagoryList =clothLineItemsDB.getList();
        Map<Catagory, List<ClothLineItem>> collect = CatagoryList.stream().collect(Collectors.groupingBy(ClothLineItem::getCatagory));

        return collect.get(catagory);
    }
}

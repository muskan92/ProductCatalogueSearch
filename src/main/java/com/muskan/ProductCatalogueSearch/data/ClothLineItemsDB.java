package com.muskan.ProductCatalogueSearch.data;

import com.muskan.ProductCatalogueSearch.constants.Catagory;
import com.muskan.ProductCatalogueSearch.constants.SizeColorConstants;
import com.muskan.ProductCatalogueSearch.entity.ClothLineItem;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class ClothLineItemsDB {

    private List<ClothLineItem> list = new ArrayList<>();

    public ClothLineItemsDB(){
        list.add(new ClothLineItem("Nyke",1000, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.BLAZER,50));
        list.add(new ClothLineItem("Nyke",500, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.PANT,100));
        list.add(new ClothLineItem("Reebok",1000, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.BLAZER,50));
        list.add(new ClothLineItem("Reebok",500, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.PANT,100));
        list.add(new ClothLineItem("Reebok",900, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.SHIRT,10));
        list.add(new ClothLineItem("Raymond",100, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.BLAZER,100));
        list.add(new ClothLineItem("Raymond",900, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.SHIRT,10));
        list.add(new ClothLineItem("Raymond",600, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.SUIT,20));
        list.add(new ClothLineItem("Mufti",1000, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.BLAZER,10));
        list.add(new ClothLineItem("Mufti",600, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.SUIT,20));
        list.add(new ClothLineItem("Mufti",700, SizeColorConstants.Size.LARGE,SizeColorConstants.Color.BLACK, Catagory.PANT,50));
    }


}

package com.muskan.ProductCatalogueSearch.controller;

import com.muskan.ProductCatalogueSearch.constants.Catagory;
import com.muskan.ProductCatalogueSearch.entity.ClothLineItem;
import com.muskan.ProductCatalogueSearch.manager.ProductCatalogManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/catalogueSearch/v1.1")
public class LineItemsResource {

    @Autowired
    ProductCatalogManager productCatalogManager;


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(path = "/getProduct/{catagory}", method = RequestMethod.GET)
    public ResponseEntity<?> getCoursePriceDetails(@PathVariable Catagory catagory) {

        logger.info("Getting product Details for {} ", catagory);

        //CoursePriceDetailsResponse coursePriceDetailsResponse = pricingServiceManager.getCoursePriceDetails(courseId, countryCode, strategyType, subscriptionMonths);

        List<ClothLineItem> productByCatagory = productCatalogManager.getProductByCatagory(catagory);

        return new ResponseEntity<>(productByCatagory, HttpStatus.OK);
    }


//    @RequestMapping(path = "/batch/coursePriceDetails", method = RequestMethod.POST)
//    public ResponseEntity<?> getCourseBatchPriceDetails(@RequestBody List<String> courseIds,
//                                                        @RequestParam(defaultValue = "IN") CountryCode countryCode,
//                                                        @RequestParam(defaultValue = "ONE_TIME_PAYMENT") StrategyType strategyType,
//                                                        @RequestParam(defaultValue = "1") int subscriptionMonths) {
//
//
//        Map<String,CoursePriceDetailsResponse> priceDetails = courseIds.stream().map(courseId ->
//            pricingServiceManager.getCoursePriceDetails(courseId, countryCode, strategyType, subscriptionMonths)
//        ).collect(Collectors.toMap(CoursePriceDetailsResponse::getCourseId, Function.identity()));
//
//        return new ResponseEntity<>(priceDetails, HttpStatus.OK);
//    }
}

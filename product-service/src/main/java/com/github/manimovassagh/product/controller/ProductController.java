package com.github.manimovassagh.product.controller;


import com.github.manimovassagh.product.DTO.ProductModel;
import com.github.manimovassagh.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController()
@RequestMapping("/api/v1")
public class ProductController implements ProductControllerInterface{
    @Autowired
    ProductService productService;

    @GetMapping("/product-health")
    public String health() {
        return "Product Microservice Controller work";
    }


    @GetMapping("/products")
    public List<ProductModel> findAll() {
        return productService.getAllProducts();
    }

    @PostMapping(path = "/products",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductModel> create(@RequestBody ProductModel product) throws ServerException {
            ProductModel savedProduct=productService.addProduct(product);
        if (savedProduct.getProductName() == null ) {
            throw new ServerException("The Product can not be Empty or null");
        }
        if (savedProduct.getQuantity() == 0 ) {
            throw new ServerException("You are not Allowed to add zero Quantity Product");
        }
        if (savedProduct.getPrice()==null ) {
            throw new ServerException("You are not Allowed to add Product without Price");
        }
        else {
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        }
    }




    //have to ask somebody how to call with UUID
    @Override
    @GetMapping("/product/uuid/{uuid}")
    public Optional<ProductModel> findProduct(@RequestParam(value = "uuid") UUID id) {
        Optional<ProductModel> product= productService.findProduct(id);
        return product;
    }

    @Override
    @GetMapping("/product/{name}")
    public List<ProductModel> findProductByName(@PathVariable  String name) {
        return productService.findByProductName(name);
    }


}

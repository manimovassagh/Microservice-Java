package com.github.com.ProductCode.controller;


import com.github.com.ProductCode.DTO.ProductCodeModel;
import com.github.com.ProductCode.ProductCodeService.ProductCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductCodeManagementController {

    @Autowired
    ProductCodeService productCodeService;


    @GetMapping("/")
    public String test() {
        return "test";
    }

    @PostMapping(path = "/new",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductCodeModel defineProductCodeInStore(@RequestBody ProductCodeModel productCodeModel) {
        return productCodeService.defineNewProductCode(productCodeModel);
    }

}

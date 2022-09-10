package com.github.com.ProductCode.ProductCodeService;


import com.github.com.ProductCode.DTO.ProductCodeModel;
import com.github.com.ProductCode.Repo.ProductCodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCodeService {
    @Autowired
    ProductCodeRepo productCodeRepo;

    public List<ProductCodeModel> getAllProductCodeList() {
        List<ProductCodeModel> productCodeModelList = productCodeRepo.findAll();
        return productCodeModelList;
    }


    public ProductCodeModel getSpecificProductBaseOnCode(String productCode) {
        return productCodeRepo.findByProductCode(productCode);
    }

    public ProductCodeModel defineNewProductCode(ProductCodeModel productCodeModel) {

      //  var p=getSpecificProductBaseOnCode(productCodeModel.getProductCode());

        //System.out.print(p);
        productCodeRepo.save(productCodeModel);
        return productCodeModel;
    }

}

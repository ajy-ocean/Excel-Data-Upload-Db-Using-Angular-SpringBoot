package com.dumping.exceldatausingapi.service;

import com.dumping.exceldatausingapi.entities.Product;
import com.dumping.exceldatausingapi.helper.ExcelHelper;
import com.dumping.exceldatausingapi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void save(MultipartFile file){
        try {
            List<Product> products = ExcelHelper.convertExcelToList(file.getInputStream());
            this.productRepo.saveAll(products);

        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    public List<Product> getAllProduct(){
        return this.productRepo.findAll();
    }
}

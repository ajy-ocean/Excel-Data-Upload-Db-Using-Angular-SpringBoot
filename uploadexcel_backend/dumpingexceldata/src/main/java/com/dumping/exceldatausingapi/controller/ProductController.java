package com.dumping.exceldatausingapi.controller;

import com.dumping.exceldatausingapi.entities.Product;
import com.dumping.exceldatausingapi.helper.ExcelHelper;
import com.dumping.exceldatausingapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) throws InterruptedException {

        Thread.sleep(5000);

        if (ExcelHelper.isExcelFormat(file)) {
            this.productService.save(file);
            return ResponseEntity.ok(Map.of("message", "Successfully Uploaded File"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("FILE NOT SUPPORTED");
    }

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return this.productService.getAllProduct();
    }
}

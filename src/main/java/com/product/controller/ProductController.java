package com.product.controller;

import com.product.request.MobileRequest;
import com.product.response.MobileResponse;
import com.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/save")
    public Object saveProduct(@RequestBody MobileRequest mobileRequest) {
        return productService.saveMobile(mobileRequest);
    }

    @GetMapping("/getMobile")
    public MobileResponse getMobile(@RequestParam(required = false) String productName) {
        return productService.getMobile(productName);
    }

    @GetMapping("/getMobileByPath/{id}")
    public Object getMobileByPath(@PathVariable("id") Long id) {
        return productService.getMobileById(id);
    }
}

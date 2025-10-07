package com.product.service;

import com.product.entity.primary.Mobile;
import com.product.repository.primary.MobileRepository;
import com.product.request.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final MobileRepository productRepository;

    public Object saveProduct(ProductRequest productRequest){
        Mobile product = new Mobile();
        product.setProductName(productRequest.getProductName());
        product.setExpiryDate(productRequest.getExpiryDate());
        product.setPurchaseDate(productRequest.getPurchaseDate());
        return productRepository.save(product);
    }
}

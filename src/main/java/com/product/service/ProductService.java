package com.product.service;

import com.product.entity.primary.Mobile;
import com.product.repository.primary.MobileRepository;
import com.product.request.MobileRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final MobileRepository mobileRepository;

    public Object saveMobile(MobileRequest productRequest){
        Mobile product = new Mobile();
        product.setProductName(productRequest.getProductName());
        product.setExpiryDate(productRequest.getExpiryDate());
        product.setPurchaseDate(productRequest.getPurchaseDate());
        return mobileRepository.save(product);
    }

    @Cacheable(value = "mobiles")
    public Object getMobile(){

        return mobileRepository.findAll();
    }
}

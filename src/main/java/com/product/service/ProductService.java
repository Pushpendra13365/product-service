package com.product.service;

import com.product.entity.primary.Mobile;
import com.product.repository.primary.MobileRepository;
import com.product.request.MobileRequest;
import com.product.response.MobileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public MobileResponse getMobile(String productName){
        Mobile mobile = mobileRepository.findByProductName(productName).orElseThrow(() -> new RuntimeException("Mobile Not Found"));
        MobileResponse mob = new MobileResponse();
        mob.setId(mobile.getId());
        mob.setProductName(mobile.getProductName());
        mob.setExpiryDate(mobile.getExpiryDate());
        return mob;
    }

    public Object getMobileById(Long id){
        return mobileRepository.findById(id);
    }
}

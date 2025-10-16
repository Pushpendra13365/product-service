package com.product.repository.primary;

import com.product.entity.primary.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MobileRepository extends JpaRepository<Mobile, Long> {

    Optional<Mobile> findByProductName(String productName);
}

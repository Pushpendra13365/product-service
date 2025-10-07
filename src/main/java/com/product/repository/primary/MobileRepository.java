package com.product.repository.primary;

import com.product.entity.primary.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Mobile,Long> {
}

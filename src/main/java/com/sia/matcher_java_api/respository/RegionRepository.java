package com.sia.matcher_java_api.respository;

import com.sia.matcher_java_api.domain.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}

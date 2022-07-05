package com.sia.matcher_java_api.respository;

import com.sia.matcher_java_api.domain.entity.AOI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AOIRepository extends JpaRepository<AOI, Long> {
}

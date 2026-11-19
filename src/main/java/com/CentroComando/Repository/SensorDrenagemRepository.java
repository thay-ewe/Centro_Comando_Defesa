package com.CentroComando.Repository;

import com.CentroComando.Entity.SensorDrenagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDrenagemRepository
        extends JpaRepository<SensorDrenagem, Long> {
}
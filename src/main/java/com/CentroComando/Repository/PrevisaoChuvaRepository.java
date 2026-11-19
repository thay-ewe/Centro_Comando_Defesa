package com.CentroComando.Repository;

import com.CentroComando.Entity.PrevisaoChuva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrevisaoChuvaRepository
        extends JpaRepository<PrevisaoChuva, Long> {
}
package com.CentroComando.Repository;

import com.CentroComando.Entity.Barragem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarragemRepository extends JpaRepository<Barragem, Long> {
}
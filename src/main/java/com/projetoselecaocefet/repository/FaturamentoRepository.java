package com.projetoselecaocefet.repository;

import com.projetoselecaocefet.entity.Faturamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturamentoRepository extends JpaRepository<Faturamento, Long> {
}

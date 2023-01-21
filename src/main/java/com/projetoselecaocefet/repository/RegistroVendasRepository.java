package com.projetoselecaocefet.repository;

import com.projetoselecaocefet.entity.RegistroVendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroVendasRepository extends JpaRepository<RegistroVendas, Long> {
}

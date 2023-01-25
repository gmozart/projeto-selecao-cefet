package com.projetoselecaocefet.repository;

import com.projetoselecaocefet.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query("select (fu.salario * (fu.beneficio/100)) + fu.salario from Funcionario fo, Funcao fu where fu.id = fo.funcao.id")
    Optional<List<Long>> listarValorTotalPagoNoMes();
}

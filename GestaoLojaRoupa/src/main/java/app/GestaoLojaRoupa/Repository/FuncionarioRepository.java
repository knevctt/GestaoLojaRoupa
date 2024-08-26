package app.GestaoLojaRoupa.Repository;

import app.GestaoLojaRoupa.Entity.Funcionario;
import app.GestaoLojaRoupa.Entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {

    public List<Funcionario> findByNome(String nome);

    Funcionario findByMatricula(String matricula);

    @Query("SELECT v FROM Venda v " +
            "JOIN v.funcionario f " +
            "WHERE f.matricula = :matricula")
    List<Venda> findVendasByMatriculaFuncionario(@Param("matricula") String matricula);
}

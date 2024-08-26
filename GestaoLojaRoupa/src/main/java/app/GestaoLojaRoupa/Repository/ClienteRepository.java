package app.GestaoLojaRoupa.Repository;

import app.GestaoLojaRoupa.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Cliente findByNome(String nome);

    List<Cliente> findByCpf (String cpf);

    @Query("SELECT c FROM Cliente c " +
            "JOIN c.vendas v " +
            "GROUP BY c.id " +
            "ORDER BY SUM(v.valorTotal) DESC")
    List<Cliente> findTop3ClientesPorGastoTotal();

}

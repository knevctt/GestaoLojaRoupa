package app.GestaoLojaRoupa.Repository;

import app.GestaoLojaRoupa.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    List<Cliente> findByNome(String nome);

    List<Cliente> findByCpf (String cpf);

    List<Cliente> findByIdadeGreaterThan(Integer idade);

    @Query("SELECT c FROM Cliente c WHERE c.nome LIKE :prefixo%")
    List<Cliente> findByPrefixo(@Param("prefixo") String prefixo);

}

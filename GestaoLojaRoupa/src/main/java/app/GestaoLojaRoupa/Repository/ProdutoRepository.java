package app.GestaoLojaRoupa.Repository;

import app.GestaoLojaRoupa.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    public List<Produto> findByNome(String nome);
}

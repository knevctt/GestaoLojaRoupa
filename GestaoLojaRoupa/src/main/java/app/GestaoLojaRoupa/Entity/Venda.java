package app.GestaoLojaRoupa.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String endereco;

    @NotNull
    private Double valorTotal;

    @ManyToOne(optional = false)
    private Cliente cliente;

    @ManyToOne(optional = false)
    private Funcionario funcionario;

    @ManyToMany
    @JoinTable(name = "venda_produtos")
    private List<Produto> produtos;
}

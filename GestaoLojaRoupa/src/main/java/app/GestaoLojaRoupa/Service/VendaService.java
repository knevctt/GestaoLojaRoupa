package app.GestaoLojaRoupa.Service;

import app.GestaoLojaRoupa.Entity.Venda;
import app.GestaoLojaRoupa.Repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public String save(Venda venda){
        this.vendaRepository.save(venda);
        return "Venda salva com sucesso";
    }

    public  String update(Venda venda, long id){
        venda.setId(id);
        this.vendaRepository.save(venda);
        return "Venda atualizada com sucesso";
    }

    public String delete(long id){
        this.vendaRepository.deleteById(id);
        return "Venda deletada com sucesso";
    }

    public List<Venda> findAll(){
        List<Venda> lista = this.vendaRepository.findAll();
        return lista;
    }

    public Venda findById(long id){
        Venda venda = this.vendaRepository.findById(id).get();
        return venda;
    }

}

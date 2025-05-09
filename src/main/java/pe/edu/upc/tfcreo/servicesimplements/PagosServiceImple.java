package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Pagos;
import pe.edu.upc.tfcreo.repositories.PagosRepository;
import pe.edu.upc.tfcreo.servicesinterface.PagosServiceInterface;

import java.util.List;

@Service
public class PagosServiceImple implements PagosServiceInterface {
    @Autowired
    private PagosRepository pagosRepository;

    @Override
    public void insertarPagos(Pagos pagos) {
        pagosRepository.save(pagos);
    }

    @Override
    public void updatePagos(Pagos pagos) {
        pagosRepository.save(pagos);
    }

    @Override
    public void eliminarPagos(int id) {
        pagosRepository.deleteById(id);
    }

    @Override
    public List<Pagos> listarPagos() {
        return pagosRepository.findAll();
    }

    @Override
    public List<String[]> Montototalen3meses() {
        return pagosRepository.montototalen3meses();
    }
}

package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Pagos;
import pe.edu.upc.tfcreo.repositories.IPagosRepository;
import pe.edu.upc.tfcreo.servicesinterface.IPagosService;

import java.util.List;

@Service
public class PagosServiceImplement implements IPagosService {

    @Autowired
    private IPagosRepository pagosR;

    @Override
    public void insertarPagos(Pagos pagos) {

    }

    @Override
    public void updatePagos(Pagos pagos) {

    }

    @Override
    public void eliminarPagos(int id) {

    }

    @Override
    public List<Pagos> listarPagos() {
        return pagosR.findAll();
    }

    @Override
    public List<String[]> Montototalen3meses() {
        return pagosR.montototalen3meses();
    }


}

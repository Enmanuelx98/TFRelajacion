package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Tarjeta;
import pe.edu.upc.tfcreo.repositories.ITarjetaRepository;
import pe.edu.upc.tfcreo.servicesinterface.ITarjetaService;

import java.util.List;

@Service
public class TarjetaServiceImplement implements ITarjetaService {

    @Autowired
    private ITarjetaRepository tarjetaR;

    @Override
    public void insertarTarjeta(Tarjeta tarjeta) {

    }

    @Override
    public void updateTarjeta(Tarjeta tarjeta) {

    }

    @Override
    public void eliminarTarjeta(int id) {

    }

    @Override
    public List<Tarjeta> listarTarjetas() {
        return tarjetaR.findAll();
    }

    @Override
    public double montototatarjetaen3meses() {
        return tarjetaR.montototatarjetaen3meses();
    }
}

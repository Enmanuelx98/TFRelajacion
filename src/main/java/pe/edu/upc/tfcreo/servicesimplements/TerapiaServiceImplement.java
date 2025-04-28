package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Terapia;
import pe.edu.upc.tfcreo.repositories.ITerapiaRepository;
import pe.edu.upc.tfcreo.servicesinterface.ITerapiaService;

import java.util.List;

@Service
public class TerapiaServiceImplement implements ITerapiaService {

    @Autowired
    private ITerapiaRepository terapiaR;

    @Override
    public void insertarTerapia(Terapia terapia) {

    }

    @Override
    public void updateTerapia(Terapia terapia) {

    }

    @Override
    public void eliminarTerapia(int id) {

    }

    @Override
    public List<Terapia> listarTerapia() {
        return terapiaR.findAll();
    }
}

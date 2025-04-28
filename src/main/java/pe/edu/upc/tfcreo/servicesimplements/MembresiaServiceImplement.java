package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Membresia;
import pe.edu.upc.tfcreo.repositories.IMembresiaRepository;
import pe.edu.upc.tfcreo.servicesinterface.IMembresiaService;

import java.util.List;

@Service
public class MembresiaServiceImplement implements IMembresiaService {

    @Autowired
    private IMembresiaRepository membresiaR;

    @Override
    public void insertarMembresia(Membresia membresia) {

    }

    @Override
    public void updateMembresia(Membresia membresia) {

    }

    @Override
    public void eliminarMembresia(int id) {

    }

    @Override
    public List<Membresia> listarMembresia() {
        return membresiaR.findAll();
    }
}

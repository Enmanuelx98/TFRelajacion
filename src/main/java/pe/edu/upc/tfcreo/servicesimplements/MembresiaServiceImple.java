package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Membresia;
import pe.edu.upc.tfcreo.repositories.MembresiaRepository;
import pe.edu.upc.tfcreo.servicesinterface.MembresiaServiceInterface;

import java.util.List;
@Service
public class MembresiaServiceImple implements MembresiaServiceInterface {
    @Autowired
    private MembresiaRepository membresiaRepository;

    @Override
    public void insertarMembresia(Membresia membresia) {
        membresiaRepository.save(membresia);
    }

    @Override
    public void updateMembresia(Membresia membresia) {
        membresiaRepository.save(membresia);
    }

    @Override
    public void eliminarMembresia(int id) {
        membresiaRepository.deleteById(id);
    }

    @Override
    public List<Membresia> listarMembresia() {
        return membresiaRepository.findAll();
    }
}

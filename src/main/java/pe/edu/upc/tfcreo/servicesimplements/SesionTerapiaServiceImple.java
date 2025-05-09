package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.SesionTerapia;
import pe.edu.upc.tfcreo.repositories.SesionTerapiaRepository;
import pe.edu.upc.tfcreo.servicesinterface.SesionTerapiaInterface;

import java.util.List;
@Service
public class SesionTerapiaServiceImple implements SesionTerapiaInterface {
    @Autowired
    private SesionTerapiaRepository sesionTerapiaRepository;
    @Override
    public void insertarSesionTerapia(SesionTerapia sesionT) {
        sesionTerapiaRepository.save(sesionT);
    }

    @Override
    public void updateSesionTerapia(SesionTerapia sesionT) {
        sesionTerapiaRepository.save(sesionT);
    }

    @Override
    public void eliminarSesionTerapia(int id) {
        sesionTerapiaRepository.deleteById(id);
    }

    @Override
    public List<SesionTerapia> listarSesionTerapia() {
        return sesionTerapiaRepository.findAll();
    }
}

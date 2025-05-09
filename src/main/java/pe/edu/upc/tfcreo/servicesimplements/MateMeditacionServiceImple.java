package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.MaterialMeditacion;
import pe.edu.upc.tfcreo.repositories.MateMeditacionRepository;
import pe.edu.upc.tfcreo.servicesinterface.MateMeditacionServiceInterface;

import java.util.List;
@Service
public class MateMeditacionServiceImple implements MateMeditacionServiceInterface {
    @Autowired
    private MateMeditacionRepository mateMeditacionRepository;
    @Override
    public void insertarMateMeditacion(MaterialMeditacion materialmeditacion) {
        mateMeditacionRepository.save(materialmeditacion);
    }

    @Override
    public void updateMateMeditacion(MaterialMeditacion materialmeditacion) {
        mateMeditacionRepository.save(materialmeditacion);
    }

    @Override
    public void eliminarMateMeditacion(int id) {
        mateMeditacionRepository.deleteById(id);
    }

    @Override
    public List<MaterialMeditacion> listarMateMeditacion() {
        return mateMeditacionRepository.findAll();
    }
}

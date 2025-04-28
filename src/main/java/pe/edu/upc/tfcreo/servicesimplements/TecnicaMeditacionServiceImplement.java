package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.TecnicaMeditacion;
import pe.edu.upc.tfcreo.repositories.ITecnicaMeditacionRepository;
import pe.edu.upc.tfcreo.servicesinterface.ITecnicaMeditacionService;

import java.util.List;

@Service
public class TecnicaMeditacionServiceImplement implements ITecnicaMeditacionService {

    @Autowired
    private ITecnicaMeditacionRepository tecnicamR;

    @Override
    public void insertarTecnicaMeditacion(TecnicaMeditacion tecnicaMeditacion) {

    }

    @Override
    public void updateTecnicaMeditacion(TecnicaMeditacion tecnicaMeditacion) {

    }

    @Override
    public void eliminarTecnicaMeditacion(int id) {

    }

    @Override
    public List<TecnicaMeditacion> listarTecnicaMeditacion() {
        return tecnicamR.findAll();
    }
}

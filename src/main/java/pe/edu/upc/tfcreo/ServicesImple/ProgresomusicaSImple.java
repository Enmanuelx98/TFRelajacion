package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;
import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;
import pe.edu.upc.tfcreo.Repository.ProgresomusicaSRepository;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresomusicaSInterface;

import java.util.List;
@Service
public class ProgresomusicaSImple implements ProgresomusicaSInterface {
    @Autowired
    private ProgresomusicaSRepository progresomusicaSRepository;
    @Override
    public void insertarProgresoMusica(ProgresomusicaS progresomusica) {
        progresomusicaSRepository.save(progresomusica);
    }

    @Override
    public void updateProgresoMusica(ProgresomusicaS progresomusica) {
        progresomusicaSRepository.save(progresomusica);
    }

    @Override
    public void eliminarProgresoMusica(int id) {
        progresomusicaSRepository.deleteById(id);
    }

    @Override
    public List<ProgresomusicaS> listarProgresoMusica() {
        return progresomusicaSRepository.findAll();
    }

    
}

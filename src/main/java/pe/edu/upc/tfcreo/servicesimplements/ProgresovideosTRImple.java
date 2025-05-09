package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.ProgresovideosTR;
import pe.edu.upc.tfcreo.repositories.ProgresovideosTRRepository;
import pe.edu.upc.tfcreo.servicesinterface.ProgresovideosTRInterface;

import java.util.List;

@Service
public class ProgresovideosTRImple implements ProgresovideosTRInterface {
    @Autowired
    private ProgresovideosTRRepository progresovideosTRRepository;
    @Override
    public void insertarProgresoVideosTR(ProgresovideosTR progresovideosTR) {
        progresovideosTRRepository.save(progresovideosTR);
    }

    @Override
    public void updateProgresoVideosTR(ProgresovideosTR progresovideosTR) {
        progresovideosTRRepository.save(progresovideosTR);

    }

    @Override
    public void eliminarProgresoVideosTR(int id) {
        progresovideosTRRepository.deleteById(id);
    }

    @Override
    public List<ProgresovideosTR> listarProgresoVideosTR() {
        return progresovideosTRRepository.findAll();
    }
}

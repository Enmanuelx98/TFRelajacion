package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.MusicaRelajacion;
import pe.edu.upc.tfcreo.repositories.IMusicaRelajacionRepository;
import pe.edu.upc.tfcreo.servicesinterface.IMusicaRelajacionService;

import java.util.List;

@Service
public class MusicaRelajacionServiceImplement implements IMusicaRelajacionService {

    @Autowired
    private IMusicaRelajacionRepository musicarR;

    @Override
    public void insertarMusicaRelajacion(MusicaRelajacion musicaRelajacion) {

    }

    @Override
    public void updateMusicaRelajacion(MusicaRelajacion musicaRelajacion) {

    }

    @Override
    public void eliminarMusicaRelajacion(int id) {

    }

    @Override
    public List<MusicaRelajacion> listarMusicaRelajacion() {
        return musicarR.findAll();
    }
}

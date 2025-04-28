package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.MusicaCategoria;
import pe.edu.upc.tfcreo.repositories.IMusicaCategoriaRepository;
import pe.edu.upc.tfcreo.servicesinterface.IMusicaCategoriaService;

import java.util.List;

@Service
public class MusicaCategoriaServiceImplement implements IMusicaCategoriaService {

    @Autowired
    private IMusicaCategoriaRepository musicacR;

    @Override
    public void insertaMusicaCategoria(MusicaCategoria musicaCategoria) {

    }

    @Override
    public void updateMusicaCategoria(MusicaCategoria musicaCategoria) {

    }

    @Override
    public void eliminarMusicaCategoria(int id) {

    }

    @Override
    public List<MusicaCategoria> listarMusicaCategoria() {
        return musicacR.findAll();
    }
}

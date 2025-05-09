package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.MusicaCategoria;
import pe.edu.upc.tfcreo.repositories.MusicaCategoriaRepository;
import pe.edu.upc.tfcreo.servicesinterface.MusicaCategoriaInterface;

import java.util.List;
@Service
public class MusicaCategoriaImple implements MusicaCategoriaInterface {
    @Autowired
    private MusicaCategoriaRepository musicaCategoriaRepository;
    @Override
    public void insertarMusicaCategoria(MusicaCategoria musicacategoria) {
        musicaCategoriaRepository.save(musicacategoria);
    }

    @Override
    public void updateMusicaCategoria(MusicaCategoria musicacategoria) {
        musicaCategoriaRepository.save(musicacategoria);

    }

    @Override
    public void eliminarMusicaCategoria(int id) {
        musicaCategoriaRepository.deleteById(id);
    }

    @Override
    public List<MusicaCategoria> listarMusicaCategoria() {
        return musicaCategoriaRepository.findAll();
    }
}

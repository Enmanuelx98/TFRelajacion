package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.MusicaRelajacion;
import pe.edu.upc.tfcreo.Repository.MusicaRelajacionRepository;
import pe.edu.upc.tfcreo.ServicesInterface.MusicaRelajacionInterface;

import java.util.List;
@Service
public class MusicaRelajacionImple implements MusicaRelajacionInterface  {
    @Autowired
    private MusicaRelajacionRepository musicaRelajacionRepository;
    @Override
    public void insertarMusicaRelax(MusicaRelajacion musicarelajacion) {
        musicaRelajacionRepository.save(musicarelajacion);
    }

    @Override
    public void updateMusicaRelax(MusicaRelajacion musicarelajacion) {
        musicaRelajacionRepository.save(musicarelajacion);

    }

    @Override
    public void eliminarMusicaRelax(int id) {
        musicaRelajacionRepository.deleteById(id);
    }

    @Override
    public List<MusicaRelajacion> listarMusicaRelax() {
        return musicaRelajacionRepository.findAll();
    }
}

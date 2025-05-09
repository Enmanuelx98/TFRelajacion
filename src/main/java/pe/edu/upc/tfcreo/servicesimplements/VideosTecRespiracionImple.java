package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.VideosTecnicasRespiracion;
import pe.edu.upc.tfcreo.repositories.VideosTecRespiracionRepository;
import pe.edu.upc.tfcreo.servicesinterface.VideosTecRespiracionInterface;

import java.util.List;
@Service
public class VideosTecRespiracionImple implements VideosTecRespiracionInterface  {
    @Autowired
    private VideosTecRespiracionRepository repovideos;
    @Override
    public void insertarVideosTecRespiracion(VideosTecnicasRespiracion videosTecRespiracion) {
        repovideos.save(videosTecRespiracion);
    }

    @Override
    public void updateVideosTecRespiracion(VideosTecnicasRespiracion videosTecRespiracion) {
        repovideos.save(videosTecRespiracion);

    }

    @Override
    public void eliminarVideosTecRespiracion(int id) {
        repovideos.deleteById(id);
    }

    @Override
    public List<VideosTecnicasRespiracion> listarVideosTecRespiracion() {
        return repovideos.findAll();
    }
}

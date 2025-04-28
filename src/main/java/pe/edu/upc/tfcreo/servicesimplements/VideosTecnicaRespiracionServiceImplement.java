package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.VideoTecnicaRespiracion;
import pe.edu.upc.tfcreo.repositories.IVideosTecnicaRespiracionRepository;
import pe.edu.upc.tfcreo.servicesinterface.IVideoTecnicaRespiracionService;

import java.util.List;

@Service
public class VideosTecnicaRespiracionServiceImplement implements IVideoTecnicaRespiracionService {

    @Autowired
    private IVideosTecnicaRespiracionRepository videostrR;

    @Override
    public void insertarVideoTecnicaRespiracion(VideoTecnicaRespiracion videoTecnicaRespiracion) {

    }

    @Override
    public void updateVideoTecnicaRespiracion(VideoTecnicaRespiracion videoTecnicaRespiracion) {

    }

    @Override
    public void eliminarVideoTecnicaRespiracion(int id) {

    }

    @Override
    public List<VideoTecnicaRespiracion> listarVideoTecnicaRespiracion() {
        return videostrR.findAll();
    }
}

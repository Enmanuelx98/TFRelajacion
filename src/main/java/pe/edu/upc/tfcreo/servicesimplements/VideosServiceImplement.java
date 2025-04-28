package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Videos;
import pe.edu.upc.tfcreo.repositories.IVideosRepository;
import pe.edu.upc.tfcreo.servicesinterface.IVideosService;

import java.util.List;

@Service
public class VideosServiceImplement implements IVideosService {

    @Autowired
    private IVideosRepository videosR;

    @Override
    public void insertarVideos(Videos videos) {

    }

    @Override
    public void updateVideos(Videos videos) {

    }

    @Override
    public void eliminarVideos(int id) {

    }

    @Override
    public List<Videos> listarUsuarios() {
        return videosR.findAll();
    }
}

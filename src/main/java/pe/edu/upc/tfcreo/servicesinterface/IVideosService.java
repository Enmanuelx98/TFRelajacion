package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Videos;

import java.util.List;

public interface IVideosService {

    public void insertarVideos(Videos videos);
    public void updateVideos(Videos videos);
    public void eliminarVideos(int id);
    public List<Videos> listarUsuarios();
}

package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.VideoTecnicaRespiracion;

import java.util.List;

public interface IVideoTecnicaRespiracionService {

    public void insertarVideoTecnicaRespiracion(VideoTecnicaRespiracion videoTecnicaRespiracion);
    public void updateVideoTecnicaRespiracion(VideoTecnicaRespiracion videoTecnicaRespiracion);
    public void eliminarVideoTecnicaRespiracion(int id);
    public List<VideoTecnicaRespiracion> listarVideoTecnicaRespiracion();
}

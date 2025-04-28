package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.MusicaRelajacion;

import java.util.List;

public interface IMusicaRelajacionService {

    public void insertarMusicaRelajacion(MusicaRelajacion musicaRelajacion);
    public void updateMusicaRelajacion(MusicaRelajacion musicaRelajacion);
    public void eliminarMusicaRelajacion(int id);
    public List<MusicaRelajacion> listarMusicaRelajacion();
}

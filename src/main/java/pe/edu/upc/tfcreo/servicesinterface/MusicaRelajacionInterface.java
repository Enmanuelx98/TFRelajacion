package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.MusicaRelajacion;

import java.util.List;

public interface MusicaRelajacionInterface {
    public void insertarMusicaRelax(MusicaRelajacion musicarelajacion);
    public void updateMusicaRelax(MusicaRelajacion musicarelajacion);
    public void eliminarMusicaRelax(int id);
    public List<MusicaRelajacion> listarMusicaRelax();
}

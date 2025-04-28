package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface MusicaRelajacionInterface {
    public void insertarMusicaRelax(MusicaRelajacion musicarelajacion);
    public void updateMusicaRelax(MusicaRelajacion musicarelajacion);
    public void eliminarMusicaRelax(int id);
    public List<MusicaRelajacion> listarMusicaRelax();
}

package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.MusicaCategoria;

import java.util.List;

public interface IMusicaCategoriaService {

    public void insertaMusicaCategoria(MusicaCategoria musicaCategoria);
    public void updateMusicaCategoria(MusicaCategoria musicaCategoria);
    public void eliminarMusicaCategoria(int id);
    public List<MusicaCategoria> listarMusicaCategoria();
}

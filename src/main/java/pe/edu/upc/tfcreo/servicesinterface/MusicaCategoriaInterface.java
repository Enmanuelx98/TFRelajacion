package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.MusicaCategoria;

import java.util.List;

public interface MusicaCategoriaInterface {
    public void insertarMusicaCategoria(MusicaCategoria musicacategoria);
    public void updateMusicaCategoria(MusicaCategoria musicacategoria);
    public void eliminarMusicaCategoria(int id);
    public List<MusicaCategoria> listarMusicaCategoria();
}

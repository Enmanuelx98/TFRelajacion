package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Playlist;

import java.util.List;

public interface IPlaylistService {

    public void insertarPlaylist(Playlist playlist);
    public void updatePlaylist(Playlist playlist);
    public void eliminarPlaylist(int id);
    public List<Playlist> listarPlaylist();
}

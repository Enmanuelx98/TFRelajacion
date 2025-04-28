package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Playlist;
import pe.edu.upc.tfcreo.repositories.IPlaylistRepository;
import pe.edu.upc.tfcreo.servicesinterface.IPlaylistService;

import java.util.List;

@Service
public class PlaylistServiceImplement implements IPlaylistService {

    @Autowired
    private IPlaylistRepository playlistR;

    @Override
    public void insertarPlaylist(Playlist playlist) {

    }

    @Override
    public void updatePlaylist(Playlist playlist) {

    }

    @Override
    public void eliminarPlaylist(int id) {

    }

    @Override
    public List<Playlist> listarPlaylist() {
        return playlistR.findAll();
    }
}

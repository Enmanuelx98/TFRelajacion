package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.PlaylistDTO;
import pe.edu.upc.tfcreo.entities.Playlist;
import pe.edu.upc.tfcreo.servicesinterface.IPlaylistService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Playlists")
public class PlaylistController {

    @Autowired
    private IPlaylistService playlistS;

    //insertar
    @PostMapping
    public void insertarPlaylist(@RequestBody PlaylistDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(dto, Playlist.class);
        playlistS.insertarPlaylist(playlist);
    }

    //modificar
    @PutMapping
    public void modificarPlaylist(@RequestBody PlaylistDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(dto, Playlist.class);
        playlistS.updatePlaylist(playlist);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarPlaylist(@PathVariable ("id")int id) {
        playlistS.eliminarPlaylist(id);
    }

    //listar
    @GetMapping
    public List<PlaylistDTO> listarPlaylists() {
        return playlistS.listarPlaylist().stream().map(x ->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PlaylistDTO.class);
        }).collect(Collectors.toList());
    }

}

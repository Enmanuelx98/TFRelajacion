package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.PlaylistDTO;
import pe.edu.upc.tfcreo.entities.Playlist;
import pe.edu.upc.tfcreo.servicesinterface.PlaylistServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {
    @Autowired
    private PlaylistServiceInterface playlistServiceinter;

    //insertar
    @PostMapping("/insertarplaylist")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void insertar(@RequestBody PlaylistDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(dto, Playlist.class);
        playlistServiceinter.insertarPlaylist(playlist);
    }

    //modificar
    @PutMapping("/modificarplaylist")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void editar(@RequestBody PlaylistDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(dto, Playlist.class);
        playlistServiceinter.updatePlaylist(playlist);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void eliminar(@PathVariable("id") int id) {
        playlistServiceinter.eliminarPlaylist(id);
    }

    //listar
    @GetMapping("/listarplaylist")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public List<PlaylistDTO> List() {
        return playlistServiceinter.listarPlaylist().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PlaylistDTO.class);
        }).collect(Collectors.toList());
    }
}

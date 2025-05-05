package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.PlaylistDTO;
import pe.edu.upc.tfcreo.Entity.Playlist;
import pe.edu.upc.tfcreo.ServicesInterface.PlaylistServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/playlist")
public class PlaylistController {
    @Autowired
    private PlaylistServiceInterface playlistServiceinter;
    //insertar
    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void insertar(@RequestBody PlaylistDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(dto, Playlist.class);
        playlistServiceinter.insertarPlaylist(playlist);
    }

    //modificar
    @PutMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void editar(@RequestBody PlaylistDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(dto, Playlist.class);
        playlistServiceinter.updatePlaylist(playlist);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void eliminar(@PathVariable("id") int id) {
        playlistServiceinter.eliminarPlaylist(id);
    }

    //listar
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public List<PlaylistDTO> List() {
        return playlistServiceinter.listarPlaylist().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PlaylistDTO.class);
        }).collect(Collectors.toList());
    }
}

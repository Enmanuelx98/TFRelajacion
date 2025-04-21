package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.PlaylistDTO;
import pe.edu.upc.tfcreo.Entity.Playlist;
import pe.edu.upc.tfcreo.ServicesInterface.PlaylistServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {
    @Autowired
    private PlaylistServiceInterface playlistServiceinter;
    //insertar
    @PostMapping
    public void insertar(@RequestBody PlaylistDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(dto, Playlist.class);
        playlistServiceinter.insertarPlaylist(playlist);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody PlaylistDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(dto, Playlist.class);
        playlistServiceinter.updatePlaylist(playlist);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        playlistServiceinter.eliminarPlaylist(id);
    }

    //listar
    @GetMapping
    public List<PlaylistDTO> List() {
        return playlistServiceinter.listarPlaylist().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PlaylistDTO.class);
        }).collect(Collectors.toList());
    }
    //buscar
    @GetMapping("/busqueda")
    public  List<PlaylistDTO> buscar(@RequestParam String nombre) {

        return playlistServiceinter.find(nombre).stream().map(    x  -> {
            ModelMapper m=new ModelMapper();
            return  m.map(x,PlaylistDTO.class);
        }).collect(Collectors.toList());
    }
}

package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MusicaCategoriaDTO;
import pe.edu.upc.tfcreo.Entity.MusicaCategoria;
import pe.edu.upc.tfcreo.ServicesInterface.MusicaCategoriaInterface;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/musicacategoria")
public class MusicaCategoriaController {
    @Autowired
    private MusicaCategoriaInterface musicaCategoriaservice;
    //insertar
    @PostMapping
    public void insertar(@RequestBody MusicaCategoriaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaCategoria musicacategoria = modelMapper.map(dto, MusicaCategoria.class);
        musicaCategoriaservice.insertarMusicaCategoria(musicacategoria);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody MusicaCategoriaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaCategoria musicacategoria = modelMapper.map(dto, MusicaCategoria.class);
        musicaCategoriaservice.updateMusicaCategoria(musicacategoria);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        musicaCategoriaservice.eliminarMusicaCategoria(id);
    }

    //listar
    @GetMapping
    public List<MusicaCategoriaDTO> List() {
        return musicaCategoriaservice.listarMusicaCategoria().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MusicaCategoriaDTO.class);
        }).collect(Collectors.toList());
    }
}

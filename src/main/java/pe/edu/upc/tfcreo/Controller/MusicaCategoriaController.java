package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MusicaCategoriaDTO;
import pe.edu.upc.tfcreo.Entity.MusicaCategoria;
import pe.edu.upc.tfcreo.ServicesInterface.MusicaCategoriaInterface;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/musicacategoria")
public class MusicaCategoriaController {
    @Autowired
    private MusicaCategoriaInterface musicaCategoriaservice;
    //insertar
    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void insertar(@RequestBody MusicaCategoriaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaCategoria musicacategoria = modelMapper.map(dto, MusicaCategoria.class);
        musicaCategoriaservice.insertarMusicaCategoria(musicacategoria);
    }

    //modificar
    @PutMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void editar(@RequestBody MusicaCategoriaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaCategoria musicacategoria = modelMapper.map(dto, MusicaCategoria.class);
        musicaCategoriaservice.updateMusicaCategoria(musicacategoria);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public void eliminar(@PathVariable("id") int id) {
        musicaCategoriaservice.eliminarMusicaCategoria(id);
    }

    //listar
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','CLIENTE')")
    public List<MusicaCategoriaDTO> List() {
        return musicaCategoriaservice.listarMusicaCategoria().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MusicaCategoriaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/lista-ordenada")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<MusicaCategoriaDTO> listarcategoriasordenadas() {
        return musicaCategoriaservice.ListarCategoriaOrdenadas().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MusicaCategoriaDTO.class);

        }).collect(Collectors.toList());
    }

    
}

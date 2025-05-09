package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MusicaCategoriaDTO;
import pe.edu.upc.tfcreo.entities.MusicaCategoria;
import pe.edu.upc.tfcreo.servicesinterface.MusicaCategoriaInterface;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/musicacategoria")
public class MusicaCategoriaController {
    @Autowired
    private MusicaCategoriaInterface musicaCategoriaservice;

    //insertar
    @PostMapping("/insertarmusicacategoria")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody MusicaCategoriaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaCategoria musicacategoria = modelMapper.map(dto, MusicaCategoria.class);
        musicaCategoriaservice.insertarMusicaCategoria(musicacategoria);
    }

    //modificar
    @PutMapping("/modificarmusicacategoria")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody MusicaCategoriaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaCategoria musicacategoria = modelMapper.map(dto, MusicaCategoria.class);
        musicaCategoriaservice.updateMusicaCategoria(musicacategoria);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        musicaCategoriaservice.eliminarMusicaCategoria(id);
    }

    //listar
    @GetMapping("/listarmusicacategoria")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public List<MusicaCategoriaDTO> List() {
        return musicaCategoriaservice.listarMusicaCategoria().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MusicaCategoriaDTO.class);
        }).collect(Collectors.toList());
    }
}

package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MusicaCategoriaDTO;
import pe.edu.upc.tfcreo.entities.MusicaCategoria;
import pe.edu.upc.tfcreo.servicesinterface.IMusicaCategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Musicacategorias")
public class MusicaCategoriaController {

    @Autowired
    private IMusicaCategoriaService musicacS;

    //insertar
    @PostMapping("insertarmusicacategoria")
    public void insertarMusicaCategoria(@RequestBody MusicaCategoriaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaCategoria musicaCategoria = modelMapper.map(dto, MusicaCategoria.class);
        musicacS.insertaMusicaCategoria(musicaCategoria);
    }

    //modificar
    @PutMapping("/modificarmusicacategoria")
    public void modificarMusicaCategoria(@RequestBody MusicaCategoriaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaCategoria musicaCategoria = modelMapper.map(dto, MusicaCategoria.class);
        musicacS.updateMusicaCategoria(musicaCategoria);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarMusicaCategoria(@PathVariable("id") int id){
        musicacS.eliminarMusicaCategoria(id);
    }

    //listar
    @GetMapping("/listarmusicacategoria")
    public List<MusicaCategoriaDTO> listarMusicaCategorias(){
        return musicacS.listarMusicaCategoria().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,MusicaCategoriaDTO.class);
        }).collect(Collectors.toList());
    }

}


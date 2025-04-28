package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MusicaCategoriaDTO;
import pe.edu.upc.tfcreo.dtos.MusicaRelajacionDTO;
import pe.edu.upc.tfcreo.entities.MusicaRelajacion;
import pe.edu.upc.tfcreo.servicesinterface.IMusicaRelajacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Musicarelajacion")
public class MusicaRelajacionController {

    @Autowired
    private IMusicaRelajacionService musicarS;

    //registrar
    @PostMapping("insertarmusicarelajacion")
    public void insertarMusicaRelajacion(MusicaCategoriaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        MusicaRelajacion musicaRelajacion = modelMapper.map(dto, MusicaRelajacion.class);
        musicarS.insertarMusicaRelajacion(musicaRelajacion);
    }

    //modificar
    @PutMapping("/modificarmusicarelajacion")
    public void modificarMusicaRelajacion(MusicaCategoriaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        MusicaRelajacion musicaRelajacion = modelMapper.map(dto, MusicaRelajacion.class);
        musicarS.updateMusicaRelajacion(musicaRelajacion);
    }

    //eliminar
    @DeleteMapping
    public void eliminarMusicaRelajacion(@PathVariable("id")int id){
        musicarS.eliminarMusicaRelajacion(id);
    }

    @GetMapping("/listarmusicarelajacion")
    public List<MusicaRelajacionDTO> listarMusicaRelajacion(){
        return musicarS.listarMusicaRelajacion().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, MusicaRelajacionDTO.class);
        }).collect(Collectors.toList());
    }

}

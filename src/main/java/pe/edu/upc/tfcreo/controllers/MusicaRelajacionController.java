package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MusicaRelajacionDTO;
import pe.edu.upc.tfcreo.entities.MusicaRelajacion;
import pe.edu.upc.tfcreo.servicesinterface.MusicaRelajacionInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/musicarelax")
public class MusicaRelajacionController {
    @Autowired
    private MusicaRelajacionInterface musicaRelajacionservice;

    @PostMapping("/insertarmusicarelax")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody MusicaRelajacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaRelajacion musicarelajacion = modelMapper.map(dto, MusicaRelajacion.class);
        musicaRelajacionservice.insertarMusicaRelax(musicarelajacion);
    }

    //modificar
    @PutMapping("/modificarmusicarelax")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody MusicaRelajacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaRelajacion musicarelajacion = modelMapper.map(dto, MusicaRelajacion.class);
        musicaRelajacionservice.updateMusicaRelax(musicarelajacion);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        musicaRelajacionservice.eliminarMusicaRelax(id);
    }

    //listar
    @GetMapping("/listarmusicarelax")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public List<MusicaRelajacionDTO> List() {
        return musicaRelajacionservice.listarMusicaRelax().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MusicaRelajacionDTO.class);
        }).collect(Collectors.toList());
    }
}

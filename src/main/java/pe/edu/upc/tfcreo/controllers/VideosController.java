package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.VideosDTO;
import pe.edu.upc.tfcreo.entities.Videos;
import pe.edu.upc.tfcreo.servicesinterface.IVideosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Videos")
public class VideosController {

    @Autowired
    private IVideosService videosS;


    //insertar
    @PostMapping("/insertarvideos")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertarVideos(@RequestBody VideosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Videos videos = modelMapper.map(dto, Videos.class);
        videosS.insertarVideos(videos);
    }

    //modificar
    @PutMapping("/modificarvideos")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificarVideos(@RequestBody VideosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Videos videos = modelMapper.map(dto, Videos.class);
        videosS.updateVideos(videos);
    }

    //eliminar
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminarVideos(@PathVariable("id") int id) {
        videosS.eliminarVideos(id);
    }

    //listar
    @GetMapping("/listarvideos")
    public List<VideosDTO> listarVideos() {
        return videosS.listarUsuarios().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VideosDTO.class);
        }).collect(Collectors.toList());
    }
}

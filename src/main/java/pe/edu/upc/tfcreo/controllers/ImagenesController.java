package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.ImagenesDTO;
import pe.edu.upc.tfcreo.entities.Imagenes;
import pe.edu.upc.tfcreo.servicesinterface.IImagenesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Imagenes")
public class ImagenesController {

    @Autowired
    private IImagenesService imagenesS;

    //insertar
    @PostMapping("/insertarimagen")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertarImagen(@RequestBody ImagenesDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Imagenes imagenes = modelMapper.map(dto, Imagenes.class);
        imagenesS.insertarImagenes(imagenes);
    }

    //modificar
    @PutMapping("/modificarimagen")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificarImagen(@RequestBody ImagenesDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Imagenes imagenes = modelMapper.map(dto, Imagenes.class);
        imagenesS.updateImagenes(imagenes);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminarImagen(@PathVariable("id")int id) {
        imagenesS.eliminarImagenes(id);
    }

    //listar
    @GetMapping("/listarimagen")
    public List<ImagenesDTO> listarImagen() {
        return imagenesS.listarImagenes().stream().map(x -> {
            ModelMapper m= new ModelMapper();
            return m.map(x, ImagenesDTO.class);
        }).collect(Collectors.toList());
    }
}

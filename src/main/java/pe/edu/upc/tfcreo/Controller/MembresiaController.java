package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MembresiaDTO;
import pe.edu.upc.tfcreo.Entity.Membresia;
import pe.edu.upc.tfcreo.ServicesInterface.MembresiaServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresia")
public class MembresiaController {
    @Autowired
    private MembresiaServiceInterface membresiaService;
    //insertar
    @PostMapping
    public void insertar(@RequestBody MembresiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Membresia membresia = modelMapper.map(dto, Membresia.class);
        membresiaService.insertarMembresia(membresia);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody MembresiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Membresia membresia = modelMapper.map(dto, Membresia.class);
        membresiaService.updateMembresia(membresia);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        membresiaService.eliminarMembresia(id);
    }

    //listar
    @GetMapping
    public List<MembresiaDTO> List() {
        return membresiaService.listarMembresia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MembresiaDTO.class);
        }).collect(Collectors.toList());
    }
}

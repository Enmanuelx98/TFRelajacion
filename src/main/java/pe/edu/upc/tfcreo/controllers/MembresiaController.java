package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MembresiaDTO;
import pe.edu.upc.tfcreo.entities.Membresia;
import pe.edu.upc.tfcreo.servicesinterface.IMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Menbresias")
public class MembresiaController {

    @Autowired
    private IMembresiaService membresiaS;

    //insertar
    @PostMapping("/insertarmembresia")
    public void inserarMembresia(@RequestBody MembresiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Membresia membresia = modelMapper.map(dto, Membresia.class);
        membresiaS.insertarMembresia(membresia);
    }

    //modificar
    @PutMapping("/modificarmembresia")
    public void modificarMembresia(@RequestBody MembresiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Membresia membresia = modelMapper.map(dto, Membresia.class);
        membresiaS.updateMembresia(membresia);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarMembresia(@PathVariable("id") int id) {
        membresiaS.eliminarMembresia(id);
    }

    //listar
    @GetMapping("/listarmembresia")
    public List<MembresiaDTO> listarMembresias() {
        return membresiaS.listarMembresia().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MembresiaDTO.class);
        }).collect(Collectors.toList());
    }

}

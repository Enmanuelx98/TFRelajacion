package pe.edu.upc.tfcreo.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MaterialDTO;
import pe.edu.upc.tfcreo.entities.Material;
import pe.edu.upc.tfcreo.servicesinterface.IMaterialService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Materias")
public class MaterialController {

    @Autowired
    private IMaterialService materiaS;

    //insertar
    @PostMapping("/insertarmaterial")
    public void insertarMaterial(@RequestBody MaterialDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Material material = modelMapper.map(dto, Material.class);
        materiaS.insertarMaterial(material);
    }

    //modificar
    @PutMapping("/modificarmaterial")
    public void modificarMaterial(@RequestBody MaterialDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Material material = modelMapper.map(dto, Material.class);
        materiaS.updateMaterial(material);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarMaterial(@PathVariable("id") int id) {
        materiaS.eliminarMaterial(id);
    }

    //listar
    @GetMapping("/listarmaterial")
    public List<MaterialDTO> listarMaterial() {
        return materiaS.listarMaterial().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MaterialDTO.class);
        }).collect(Collectors.toList());
    }
}

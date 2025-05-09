package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.ProgresoMaterialMediDTO;
import pe.edu.upc.tfcreo.entities.ProgresoMaterialMedi;
import pe.edu.upc.tfcreo.servicesinterface.ProgresoMaterialMediInterface;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/progresomaterialmedi")
public class ProgresoMaterialMediController {
    @Autowired
    private ProgresoMaterialMediInterface progresoMaterialMediInterface;

    //insertar
    @PostMapping("/insertarprogresomaterialmedi")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody ProgresoMaterialMediDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresoMaterialMedi progresomaterialMedi = modelMapper.map(dto, ProgresoMaterialMedi.class);
        progresoMaterialMediInterface.insertarProgresoMaterialMedi(progresomaterialMedi);
    }

    //modificar
    @PutMapping("/modificarprogresomaterialmedi")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody ProgresoMaterialMediDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresoMaterialMedi progresomaterialMedi = modelMapper.map(dto, ProgresoMaterialMedi.class);
        progresoMaterialMediInterface.updateProgresoMaterialMedi(progresomaterialMedi);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        progresoMaterialMediInterface.eliminarProgresoMaterialMedi(id);
    }

    //listar
    @GetMapping("/listarprogresomaterialmedi")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ProgresoMaterialMediDTO> List() {
        return progresoMaterialMediInterface.listarProgresoMaterialMedi().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresoMaterialMediDTO.class);
        }).collect(Collectors.toList());
    }
}

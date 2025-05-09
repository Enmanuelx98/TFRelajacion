package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.TipoMaterialDTO;
import pe.edu.upc.tfcreo.entities.TipoMaterial;
import pe.edu.upc.tfcreo.servicesinterface.TipoMaterialServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipomaterial")
public class TipoMaterialController {
    @Autowired
    private TipoMaterialServiceInterface tipoMaterialService;

    //insertar
    @PostMapping("/insertartipomaterial")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody TipoMaterialDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoMaterial tipoMaterial = modelMapper.map(dto, TipoMaterial.class);
        tipoMaterialService.insertarTipoMaterial(tipoMaterial);
    }

    //modificar
    @PutMapping("/modificartipomaterial")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody TipoMaterialDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoMaterial tipoMaterial = modelMapper.map(dto, TipoMaterial.class);
        tipoMaterialService.updateTipoMaterial(tipoMaterial);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        tipoMaterialService.eliminarTipoMaterial(id);
    }

    //listar
    @GetMapping("/listartipomaterial")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<TipoMaterialDTO> List() {
        return tipoMaterialService.listarTipoMaterial().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoMaterialDTO.class);
        }).collect(Collectors.toList());
    }
}


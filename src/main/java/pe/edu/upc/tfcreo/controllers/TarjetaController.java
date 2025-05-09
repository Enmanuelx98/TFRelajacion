package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.TarjetaDTO;
import pe.edu.upc.tfcreo.entities.Tarjeta;
import pe.edu.upc.tfcreo.servicesinterface.TarjetaServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {
    @Autowired
    private TarjetaServiceInterface tarjetaService;

    //insertar
    @PostMapping("/insertartarjeta")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void insertar(@RequestBody TarjetaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Tarjeta tarjeta = modelMapper.map(dto, Tarjeta.class);
        tarjetaService.insertarTarjeta(tarjeta);
    }

    //modificar
    @PutMapping("/modificartarjeta")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void editar(@RequestBody TarjetaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Tarjeta tarjeta = modelMapper.map(dto, Tarjeta.class);
        tarjetaService.updateTarjeta(tarjeta);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void eliminar(@PathVariable("id") int id) {
        tarjetaService.eliminarTarjeta(id);
    }

    //listar
    @GetMapping("/listartarjeta")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<TarjetaDTO> List() {
        return tarjetaService.listarTarjeta().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TarjetaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/montototaltarjetaenfechadeterminada")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Double obtenerMontoTotalTarjetaEn3Meses() {
        return tarjetaService.montototatarjetaen3meses();
    }

}

package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MontoTotalen3MesesDTO;
import pe.edu.upc.tfcreo.dtos.PagosDTO;
import pe.edu.upc.tfcreo.entities.Pagos;
import pe.edu.upc.tfcreo.servicesinterface.PagosServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagosController {
    @Autowired
    private PagosServiceInterface pagosService;

    //insertar
    @PostMapping("/insertarpagos")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void insertar(@RequestBody PagosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pagos pagos = modelMapper.map(dto, Pagos.class);
        pagosService.insertarPagos(pagos);
    }

    //modificar
    @PutMapping("/modificarpagos")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void editar(@RequestBody PagosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pagos pagos = modelMapper.map(dto, Pagos.class);
        pagosService.updatePagos(pagos);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        pagosService.eliminarPagos(id);
    }

    //listar
    @GetMapping("/listarpagos")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PagosDTO> List() {
        return pagosService.listarPagos().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PagosDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/montototalen3meses")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<MontoTotalen3MesesDTO> montoTotalen3Meses() {
        List<MontoTotalen3MesesDTO> dtoLista=new ArrayList<>();
        List<String[]>fila=pagosService.Montototalen3meses();
        for(String[]columna:fila) {
            MontoTotalen3MesesDTO dto=new MontoTotalen3MesesDTO();
            dto.setCantidadTotalPagos3Meses(Integer.parseInt(columna[0]));
            dto.setMontoTotalPagos3Meses(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}

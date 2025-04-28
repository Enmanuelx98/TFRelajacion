package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.MontoTotalen3MesesDTO;
import pe.edu.upc.tfcreo.dtos.PagosDTO;
import pe.edu.upc.tfcreo.entities.Pagos;
import pe.edu.upc.tfcreo.servicesinterface.IPagosService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Pagos")
public class PagosController {

    @Autowired
    private IPagosService pagosS;

    //insertar
    @PostMapping("/insertarpagos")
    public void insertarPagos(@RequestBody PagosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pagos pagos = modelMapper.map(dto, Pagos.class);
        pagosS.insertarPagos(pagos);
    }

    //modificar
    @PutMapping("/modificarpagos")
    public void modificarPagos(@RequestBody PagosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pagos pagos = modelMapper.map(dto, Pagos.class);
        pagosS.updatePagos(pagos);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarPagos(@PathVariable("id") int id) {
        pagosS.eliminarPagos(id);
    }

    //listar
    @GetMapping("/listarpagos")
    public List<PagosDTO> listarPagos(){
        return pagosS.listarPagos().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagosDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/montototalen3meses")
    public List<MontoTotalen3MesesDTO> montoTotalen3Meses() {
        List<MontoTotalen3MesesDTO> dtoLista=new ArrayList<>();
        List<String[]>fila=pagosS.Montototalen3meses();
        for(String[]columna:fila) {
            MontoTotalen3MesesDTO dto=new MontoTotalen3MesesDTO();
            dto.setCantidadTotalPagos3Meses(Integer.parseInt(columna[0]));
            dto.setMontoTotalPagos3Meses(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }



}

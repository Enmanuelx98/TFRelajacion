package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.EvaluacionPsicologicaDTO;
import pe.edu.upc.tfcreo.entities.EvaluacionPsicologica;
import pe.edu.upc.tfcreo.servicesinterface.IEvaluacionPsicologicaService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/Evaluacionpsicologica")
public class EvaluacionPsicologicaController {

    @Autowired
    private IEvaluacionPsicologicaService evaluacionpS;

    //insertar
    @PostMapping("/insertarevaluacionpsicologica")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertarEvaluacionPsicologica(@RequestBody EvaluacionPsicologicaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        EvaluacionPsicologica evaluacionPsicologica = modelMapper.map(dto, EvaluacionPsicologica.class);
        evaluacionpS.insertarEvaluacionPsicologica(evaluacionPsicologica);
    }

    //modificar
    @PutMapping("/modificarevaluacionpsicologica")
    @PreAuthorize("hasAuthority('ADMIN')")
    private void modificarEvaluacionPsicologica(@RequestBody EvaluacionPsicologicaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        EvaluacionPsicologica evaluacionPsicologica = modelMapper.map(dto, EvaluacionPsicologica.class);
        evaluacionpS.updateEvaluacionPsicologica(evaluacionPsicologica);
    }

    //eliminar
    @DeleteMapping("/eliminarevaluacionpsicologica")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminarEvaluacionPsicologica(@PathVariable ("id") int id) {
        evaluacionpS.eliminarEvaluacionPsicologica(id);
    }

    //listar
    @GetMapping("/listarevaluacionpsicologica")
    public List<EvaluacionPsicologicaDTO> listarEvaluacionPsicologica() {
        return evaluacionpS.listarEvaluacionPsicologica().stream().map(x-> {
            ModelMapper m=new ModelMapper();
            return m.map(x,EvaluacionPsicologicaDTO.class);
        }).collect(Collectors.toList());
    }
}

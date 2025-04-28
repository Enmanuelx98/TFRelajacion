package pe.edu.upc.tfcreo.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.DocumentosDTO;
import pe.edu.upc.tfcreo.entities.Documentos;
import pe.edu.upc.tfcreo.servicesinterface.IDocumentosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Documentos")
public class DocumentosController {

    @Autowired
    private IDocumentosService documentosS;

    //insertar
    @PostMapping("/insertardocumentos")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertarDocumento(@RequestBody DocumentosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Documentos documentos = modelMapper.map(dto, Documentos.class);
        documentosS.insertarDocumentos(documentos);
    }

    //modificar
    @PutMapping("/modificardocumento")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificarDocumento(@RequestBody DocumentosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Documentos documentos = modelMapper.map(dto, Documentos.class);
        documentosS.updateDocumentos(documentos);
    }

    //eliminar
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminarDocumento(@PathVariable("id") int id) {
        documentosS.eliminarDocumentos(id);
    }

    //listar
    @GetMapping("listardocumentos")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DocumentosDTO> listarDocumento() {
        return documentosS.listarDocumentos().stream().map(x -> {
            ModelMapper m=new ModelMapper();
            return m.map(x, DocumentosDTO.class);
        }).collect(Collectors.toList());
    }
}

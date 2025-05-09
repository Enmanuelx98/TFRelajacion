package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.UsuarioDTO;
import pe.edu.upc.tfcreo.entities.Usuario;
import pe.edu.upc.tfcreo.servicesinterface.UsuarioServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServiceInterface usuarioService;

    //insertar
    @PostMapping("/insertarusuario")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void insertar(@RequestBody UsuarioDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(dto, Usuario.class);
        usuarioService.insertarUsuario(usuario);
    }

    //modificar
    @PutMapping("/modificarusuario")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody UsuarioDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(dto, Usuario.class);
        usuarioService.updateUsuario(usuario);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('CLIENT','ADMIN','SUDS')")
    public void eliminar(@PathVariable("id") int id) {
        usuarioService.eliminarUsuario(id);
    }

    //listar
    @GetMapping("/listarusuario")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UsuarioDTO> List() {
        return usuarioService.listarUsuario().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}

package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.UsersDTO;
import pe.edu.upc.tfcreo.Entity.Users;
import pe.edu.upc.tfcreo.ServicesInterface.UsuarioServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServiceInterface usuarioService;
    //insertar
    @PostMapping("/insertarusuario")
    public void insertar(@RequestBody UsersDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Users users = modelMapper.map(dto, Users.class);
        usuarioService.insertarUsuario(users);
    }

    //modificar
    @PutMapping
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public void editar(@RequestBody UsersDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Users users = modelMapper.map(dto, Users.class);
        usuarioService.updateUsuario(users);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public void eliminar(@PathVariable("id") int id) {
        usuarioService.eliminarUsuario(id);
    }

    //listar
    @GetMapping(produces = "application/json")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public List<UsersDTO> List() {
        return usuarioService.listarUsuario().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsersDTO.class);
        }).collect(Collectors.toList());
    }
}

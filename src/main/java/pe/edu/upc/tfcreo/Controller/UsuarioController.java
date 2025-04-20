package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.UsuarioDTO;
import pe.edu.upc.tfcreo.Entity.Usuario;
import pe.edu.upc.tfcreo.ServicesImple.UsuarioServiceImple;
import pe.edu.upc.tfcreo.ServicesInterface.UsuarioServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServiceInterface usuarioService;
    //insertar
    @PostMapping
    public void insertar(@RequestBody UsuarioDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(dto, Usuario.class);
        usuarioService.insertarUsuario(usuario);
    }

    //modificar
    @PutMapping
    public void editar(@RequestBody UsuarioDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(dto, Usuario.class);
        usuarioService.updateUsuario(usuario);

    }

    //delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        usuarioService.eliminarUsuario(id);
    }

    //listar
    @GetMapping
    public List<UsuarioDTO> List() {
        return usuarioService.listarUsuario().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}

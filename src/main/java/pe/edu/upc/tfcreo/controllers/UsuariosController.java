package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.UsuariosDTO;
import pe.edu.upc.tfcreo.entities.Usuarios;
import pe.edu.upc.tfcreo.servicesinterface.IUsuariosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Usuarios")
public class UsuariosController {

    @Autowired
    private IUsuariosService usuariosS;

    //insertar
    @PostMapping("/insertarusuarios")
    public void insertarUsuarios(@RequestBody UsuariosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Usuarios usuario = modelMapper.map(dto, Usuarios.class);
        usuariosS.insertarUsuarios(usuario);
    }

    //modificar
    @PutMapping("/modificarusuarios")
    public void modificarUsuarios(@RequestBody UsuariosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Usuarios usuario = modelMapper.map(dto, Usuarios.class);
        usuariosS.updateUsuarios(usuario);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public void eliminarUsuarios(@PathVariable("id") int id) {usuariosS.eliminarUsuarios(id);}

    //listar
    @GetMapping("/listarusuarios")
    public List<UsuariosDTO> listarUsuarios() {
        return usuariosS.listarUsuarios().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuariosDTO.class);
        }).collect(Collectors.toList());
    }

}

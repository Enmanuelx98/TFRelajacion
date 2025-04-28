package pe.edu.upc.tfcreo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.dtos.RoleDTO;
import pe.edu.upc.tfcreo.entities.Role;
import pe.edu.upc.tfcreo.servicesinterface.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Roles")
public class RoleController {

    @Autowired
    private IRoleService roleS;

    @PostMapping("/insertarrole")
    public void insertarRole(@RequestBody RoleDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Role role = modelMapper.map(dto, Role.class);
        roleS.insertRole(role);
    }

    @PutMapping
    public void modificarRole(@RequestBody RoleDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Role role = modelMapper.map(dto, Role.class);
        roleS.updateRole(role);
    }


    @DeleteMapping("/{id}")
        public void eliminarRole(@PathVariable("id") int id) {
        roleS.eliminarRole(id);}


    @GetMapping("/listarrole")
    public List<RoleDTO> listarRoles() {
        return roleS.listarRoles().stream().map(x-> {
            ModelMapper m=new ModelMapper();
            return m.map(x,RoleDTO.class);
        }).collect(Collectors.toList());

    }

}



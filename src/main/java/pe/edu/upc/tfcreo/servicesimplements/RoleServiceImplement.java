package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Role;
import pe.edu.upc.tfcreo.repositories.IRoleRepository;
import pe.edu.upc.tfcreo.servicesinterface.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {

    @Autowired
    private IRoleRepository roleR;

    @Override
    public void insertRole(Role role) {

    }

    @Override
    public void updateRole(Role role) {

    }

    @Override
    public void eliminarRole(int id) {

    }

    @Override
    public List<Role> listarRoles() {
        return roleR.findAll();
    }
}

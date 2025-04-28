package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Role;

import java.util.List;

public interface IRoleService {

    public void insertRole(Role role);
    public void updateRole(Role role);
    public void eliminarRole(int id);
    public List<Role> listarRoles();
}

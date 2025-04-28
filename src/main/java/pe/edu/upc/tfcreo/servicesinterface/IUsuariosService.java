package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Usuarios;

import java.util.List;

public interface IUsuariosService {

    public void insertarUsuarios(Usuarios usuarios);
    public void updateUsuarios(Usuarios usuarios);
    public void eliminarUsuarios(int id);
    public List<Usuarios> listarUsuarios();
}

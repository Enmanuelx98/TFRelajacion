package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Rol;

import java.util.List;

public interface RolSeriveInterface {
    public void insertarRol(Rol rol);
    public void updateRol(Rol rol);
    public void eliminarRol(int id);
    public List<Rol> listarRol();
}

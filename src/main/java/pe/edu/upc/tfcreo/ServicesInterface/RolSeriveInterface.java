package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface RolSeriveInterface {
    public void insertarRol(Rol rol);
    public void updateRol(Rol rol);
    public void eliminarRol(int id);
    public List<Rol> listarRol();
}

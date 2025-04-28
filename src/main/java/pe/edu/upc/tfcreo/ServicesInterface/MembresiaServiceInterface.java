package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface MembresiaServiceInterface {
    public void insertarMembresia(Membresia membresia);
    public void updateMembresia(Membresia membresia);
    public void eliminarMembresia(int id);
    public List<Membresia> listarMembresia();
}

package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Membresia;

import java.util.List;

public interface IMembresiaService {

    public void insertarMembresia(Membresia membresia);
    public void updateMembresia(Membresia membresia);
    public void eliminarMembresia(int id);
    public List<Membresia> listarMembresia();
}

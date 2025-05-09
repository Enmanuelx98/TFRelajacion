package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Terapia;

import java.util.List;

public interface TerapiaServiceInterface {
    public void insertarTerapia(Terapia terapia);
    public void updateTerapia(Terapia terapia);
    public void eliminarTerapia(int id);
    public List<Terapia> listarTerapia();
}

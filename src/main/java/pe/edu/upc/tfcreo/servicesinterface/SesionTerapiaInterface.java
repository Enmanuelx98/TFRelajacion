package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.SesionTerapia;

import java.util.List;

public interface SesionTerapiaInterface {
    public void insertarSesionTerapia(SesionTerapia sesionT);
    public void updateSesionTerapia(SesionTerapia sesionT);
    public void eliminarSesionTerapia(int id);
    public List<SesionTerapia> listarSesionTerapia();
}

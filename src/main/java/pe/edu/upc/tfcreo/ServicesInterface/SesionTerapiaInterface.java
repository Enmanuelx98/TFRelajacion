package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface SesionTerapiaInterface {
    public void insertarSesionTerapia(SesionTerapia sesionT);
    public void updateSesionTerapia(SesionTerapia sesionT);
    public void eliminarSesionTerapia(int id);
    public List<SesionTerapia> listarSesionTerapia();
}

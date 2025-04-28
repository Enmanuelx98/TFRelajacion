package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.TecnicaMeditacion;

import java.util.List;

public interface ITecnicaMeditacionService {

    public void insertarTecnicaMeditacion(TecnicaMeditacion tecnicaMeditacion);
    public void updateTecnicaMeditacion(TecnicaMeditacion tecnicaMeditacion);
    public void eliminarTecnicaMeditacion(int id);
    public List<TecnicaMeditacion> listarTecnicaMeditacion();
}

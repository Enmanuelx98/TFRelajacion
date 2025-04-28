package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface TecMeditacionServiceInterface {
    public void insertarTecMeditacion(TecnicaMeditacion tecnicameditacion);
    public void updateTecMeditacion(TecnicaMeditacion tecnicameditacion);
    public void eliminarTecMeditacion(int id);
    public List<TecnicaMeditacion> listarTecMeditacion();
}

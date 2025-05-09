package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.MaterialMeditacion;

import java.util.List;

public interface MateMeditacionServiceInterface {
    public void insertarMateMeditacion(MaterialMeditacion materialmeditacion);
    public void updateMateMeditacion(MaterialMeditacion materialmeditacion);
    public void eliminarMateMeditacion(int id);
    public List<MaterialMeditacion> listarMateMeditacion();
}

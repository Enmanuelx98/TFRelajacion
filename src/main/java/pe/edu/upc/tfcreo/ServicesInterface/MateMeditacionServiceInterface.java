package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface MateMeditacionServiceInterface {
    public void insertarMateMeditacion(MaterialMeditacion materialmeditacion);
    public void updateMateMeditacion(MaterialMeditacion materialmeditacion);
    public void eliminarMateMeditacion(int id);
    public List<MaterialMeditacion> listarMateMeditacion();
}

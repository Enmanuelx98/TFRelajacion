package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Pagos;

import java.util.List;

public interface PagosServiceInterface {
    public void insertarPagos(Pagos pagos);
    public void updatePagos(Pagos pagos);
    public void eliminarPagos(int id);
    public List<Pagos > listarPagos();

    public List<String[]>Montototalen3meses();
}

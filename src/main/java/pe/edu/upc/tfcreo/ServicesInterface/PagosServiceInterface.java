package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface PagosServiceInterface {
    public void insertarPagos(Pagos pagos);
    public void updatePagos(Pagos pagos);
    public void eliminarPagos(int id);
    public List<Pagos > listarPagos();
}

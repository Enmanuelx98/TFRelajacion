package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface TarjetaServiceInterface {
    public void insertarTarjeta(Tarjeta tarjeta);
    public void updateTarjeta(Tarjeta tarjeta);
    public void eliminarTarjeta(int id);
    public List<Tarjeta> listarTarjeta();
}

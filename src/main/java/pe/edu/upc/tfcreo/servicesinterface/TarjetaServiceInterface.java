package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Tarjeta;

import java.util.List;

public interface TarjetaServiceInterface {
    public void insertarTarjeta(Tarjeta tarjeta);
    public void updateTarjeta(Tarjeta tarjeta);
    public void eliminarTarjeta(int id);
    public List<Tarjeta> listarTarjeta();

    public double montototatarjetaen3meses();
}

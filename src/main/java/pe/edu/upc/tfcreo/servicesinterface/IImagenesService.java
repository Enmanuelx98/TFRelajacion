package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Imagenes;

import java.util.List;

public interface IImagenesService {

    public void insertarImagenes(Imagenes imagenes);
    public void updateImagenes(Imagenes imagenes);
    public void eliminarImagenes(int id);
    public List<Imagenes> listarImagenes();
}

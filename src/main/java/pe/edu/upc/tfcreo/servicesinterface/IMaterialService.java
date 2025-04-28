package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Material;

import java.util.List;

public interface IMaterialService {

    public void insertarMaterial(Material material);
    public void updateMaterial(Material material);
    public void eliminarMaterial(int id);
    public List<Material> listarMaterial();
}

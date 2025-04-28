package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface TipoMaterialServiceInterface {
    public void insertarTipoMaterial(TipoMaterial tipomaterial);
    public void updateTipoMaterial(TipoMaterial tipomaterial);
    public void eliminarTipoMaterial(int id);
    public List<TipoMaterial> listarTipoMaterial();
}

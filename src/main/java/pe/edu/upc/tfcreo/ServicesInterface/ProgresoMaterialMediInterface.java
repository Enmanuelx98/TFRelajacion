package pe.edu.upc.tfcreo.ServicesInterface;

import java.util.List;

public interface ProgresoMaterialMediInterface {
    public void insertarProgresoMaterialMedi(ProgresoMaterialMedi progresomaterialmedi);
    public void updateProgresoMaterialMedi(ProgresoMaterialMedi progresomaterialmedi);
    public void eliminarProgresoMaterialMedi(int id);
    public List<ProgresoMaterialMedi> listarProgresoMaterialMedi();
}

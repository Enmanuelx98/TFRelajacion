package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;

import java.util.List;

public interface ProgresovideosTRInterface {
    public void insertarProgresoVideosTR(ProgresovideosTR progresovideosTR);
    public void updateProgresoVideosTR(ProgresovideosTR progresovideosTR);
    public void eliminarProgresoVideosTR(int id);
    public List<ProgresovideosTR> listarProgresoVideosTR();
}

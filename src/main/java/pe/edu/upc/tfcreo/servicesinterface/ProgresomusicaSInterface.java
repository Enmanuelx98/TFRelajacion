package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.ProgresomusicaS;

import java.util.List;

public interface ProgresomusicaSInterface {
    public void insertarProgresoMusica(ProgresomusicaS progresomusica);
    public void updateProgresoMusica(ProgresomusicaS progresomusica);
    public void eliminarProgresoMusica(int id);
    public List<ProgresomusicaS> listarProgresoMusica();
}

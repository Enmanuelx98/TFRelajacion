package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.EvaluacionPsicologica;

import java.util.List;

public interface IEvaluacionPsicologicaService {
    public void insertarEvaluacionPsicologica(EvaluacionPsicologica evaluacionPsicologica);
    public void updateEvaluacionPsicologica(EvaluacionPsicologica evaluacionPsicologica);
    public void eliminarEvaluacionPsicologica(int id);
    public List<EvaluacionPsicologica> listarEvaluacionPsicologica();
}

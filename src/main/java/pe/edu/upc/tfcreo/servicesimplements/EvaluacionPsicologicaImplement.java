package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.EvaluacionPsicologica;
import pe.edu.upc.tfcreo.repositories.IEvaluacionPsicologicaRepository;
import pe.edu.upc.tfcreo.servicesinterface.IEvaluacionPsicologicaService;

import java.util.List;

@Service
public class EvaluacionPsicologicaImplement implements IEvaluacionPsicologicaService {

    @Autowired
    private IEvaluacionPsicologicaRepository evaluacionpR;

    @Override
    public void insertarEvaluacionPsicologica(EvaluacionPsicologica evaluacionPsicologica) {
        evaluacionpR.save(evaluacionPsicologica);
    }

    @Override
    public void updateEvaluacionPsicologica(EvaluacionPsicologica evaluacionPsicologica) {
        evaluacionpR.save(evaluacionPsicologica);
    }

    @Override
    public void eliminarEvaluacionPsicologica(int id) {
        evaluacionpR.deleteById(id);
    }

    @Override
    public List<EvaluacionPsicologica> listarEvaluacionPsicologica() {
        return evaluacionpR.findAll();
    }
}

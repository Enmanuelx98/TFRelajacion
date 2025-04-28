package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Repository.ProgresoMaterialMediRepository;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresoMaterialMediInterface;

import java.util.List;
@Service
public class ProgresoMaterialMediImple implements ProgresoMaterialMediInterface {
    @Autowired
    private ProgresoMaterialMediRepository progresoMaterialMediRepository;
    @Override
    public void insertarProgresoMaterialMedi(ProgresoMaterialMedi progresomaterialmedi) {
        progresoMaterialMediRepository.save(progresomaterialmedi);
    }

    @Override
    public void updateProgresoMaterialMedi(ProgresoMaterialMedi progresomaterialmedi) {
        progresoMaterialMediRepository.save(progresomaterialmedi);

    }

    @Override
    public void eliminarProgresoMaterialMedi(int id) {
        progresoMaterialMediRepository.deleteById(id);
    }

    @Override
    public List<ProgresoMaterialMedi> listarProgresoMaterialMedi() {
        return progresoMaterialMediRepository.findAll();
    }
}

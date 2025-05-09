package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.TipoMaterial;
import pe.edu.upc.tfcreo.repositories.TipoMaterialRepository;
import pe.edu.upc.tfcreo.servicesinterface.TipoMaterialServiceInterface;

import java.util.List;
@Service
public class TipoMaterialServiceImple implements TipoMaterialServiceInterface {
    @Autowired
    private TipoMaterialRepository tipoMaterialRepository;
    @Override
    public void insertarTipoMaterial(TipoMaterial tipomaterial) {
        tipoMaterialRepository.save(tipomaterial);
    }

    @Override
    public void updateTipoMaterial(TipoMaterial tipomaterial) {
        tipoMaterialRepository.save(tipomaterial);
    }

    @Override
    public void eliminarTipoMaterial(int id) {
        tipoMaterialRepository.deleteById(id);
    }

    @Override
    public List<TipoMaterial> listarTipoMaterial() {
        return tipoMaterialRepository.findAll();
    }
}

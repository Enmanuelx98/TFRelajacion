package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Material;
import pe.edu.upc.tfcreo.repositories.IMaterialRepository;
import pe.edu.upc.tfcreo.servicesinterface.IMaterialService;

import java.util.List;

@Service
public class MaterialServiceImplement implements IMaterialService {

    @Autowired
    private IMaterialRepository materialR;

    @Override
    public void insertarMaterial(Material material) {

    }

    @Override
    public void updateMaterial(Material material) {

    }

    @Override
    public void eliminarMaterial(int id) {

    }

    @Override
    public List<Material> listarMaterial() {
        return materialR.findAll();
    }
}

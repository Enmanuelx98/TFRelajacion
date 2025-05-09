package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Rol;
import pe.edu.upc.tfcreo.repositories.RolRepository;
import pe.edu.upc.tfcreo.servicesinterface.RolSeriveInterface;

import java.util.List;
@Service
public class RolServiceImple implements RolSeriveInterface {
    @Autowired
    private RolRepository rolRepository;
    @Override
    public void insertarRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void updateRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void eliminarRol(int id) {
        rolRepository.deleteById(id);
    }

    @Override
    public List<Rol> listarRol() {
        return rolRepository.findAll();
    }

}

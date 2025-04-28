package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Usuarios;
import pe.edu.upc.tfcreo.repositories.IUsuariosRepository;
import pe.edu.upc.tfcreo.servicesinterface.IUsuariosService;

import java.util.List;

@Service
public class UsuariosServiceImplement implements IUsuariosService {

    @Autowired
    private IUsuariosRepository usuariosR;

    @Override
    public void insertarUsuarios(Usuarios usuarios) {

    }

    @Override
    public void updateUsuarios(Usuarios usuarios) {

    }

    @Override
    public void eliminarUsuarios(int id) {

    }

    @Override
    public List<Usuarios> listarUsuarios() {
        return usuariosR.findAll();
    }
}

package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Usuario;
import pe.edu.upc.tfcreo.repositories.UsuarioRepository;
import pe.edu.upc.tfcreo.servicesinterface.UsuarioServiceInterface;

import java.util.List;
@Service
public class UsuarioServiceImple implements UsuarioServiceInterface {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void insertarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(int id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }
}

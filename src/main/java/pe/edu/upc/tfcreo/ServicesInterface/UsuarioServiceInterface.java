package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.Usuario;

import java.util.List;

public interface UsuarioServiceInterface {
    public void insertarUsuario(Usuario usuario);
    public void updateUsuario(Usuario usuario);
    public void eliminarUsuario(int id);
    public List<Usuario> listarUsuario();
}

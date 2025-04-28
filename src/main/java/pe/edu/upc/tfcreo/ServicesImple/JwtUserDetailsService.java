package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private IUsuariosRepository repo;


    @Override
    public UserDetails loadUserByUsername(String correoUsuarios) throws UsernameNotFoundException {
        Usuarios usuarios = repo.findOneByCorreoUsuarios(correoUsuarios);

        if (usuarios == null) {
            throw new UsernameNotFoundException(String.format("User not exists", correoUsuarios));
        }

        List<GrantedAuthority> roles = new ArrayList<>();

        usuarios.getRoles().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getRol()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(usuarios.getCorreoUsuarios(), usuarios.getContrasenaUsuarios(), usuarios.getActivado(), true, true, true, roles);

        return ud;
    }
}

package pe.edu.upc.tfcreo.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.entities.Usuarios;


@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer> {
    Usuarios findOneByCorreoUsuarios(String correoUsuarios);

    //buscar por correo
    @Query("select count(u.correoUsuarios) from Usuarios u where u.correoUsuarios=:correoUsuarios")
    public int buscarCorreoUsuarios(@Param("correoUsuarios") String correoUsuarios);

    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, usuarios_id) VALUES (:rol, :usuarios_id)", nativeQuery = true)
    public void insertarRol(@Param("rol") String authority, @Param("usuarios_id") Long usuarios_id );

}

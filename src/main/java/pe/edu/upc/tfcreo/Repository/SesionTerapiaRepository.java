package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;

import java.util.List;

@Repository
public interface SesionTerapiaRepository extends JpaRepository<SesionTerapia, Integer> {
    //Cantidad de sesiones de un usuario
    @Query(value="select * \n" +
            "from SesionTerapia se\n" +
            "where se.idusuario = :u",nativeQuery=true)
    public List<SesionTerapia> quantitySesionesbyUsuario(@Param("u") int u);

    //Cantidad de sesiones que ha completado un usuario
    @Query(value="select * \n" +
            "from SesionTerapia se\n" +
            "where se.idusuario = :u2 and se.completado = true",nativeQuery=true)
    public List<SesionTerapia> quantitySesionesCompletobyUsuario(@Param("u2") int u2);
}

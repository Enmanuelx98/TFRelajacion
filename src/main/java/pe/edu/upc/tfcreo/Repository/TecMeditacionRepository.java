package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.TecnicaMeditacion;

@Repository
public interface TecMeditacionRepository extends JpaRepository<TecnicaMeditacion, Integer> {
}

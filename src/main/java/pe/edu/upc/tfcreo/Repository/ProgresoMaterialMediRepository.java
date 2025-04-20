package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.ProgresoMaterialMedi;
@Repository
public interface ProgresoMaterialMediRepository extends JpaRepository<ProgresoMaterialMedi,Integer> {
}

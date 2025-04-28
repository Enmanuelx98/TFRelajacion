package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.ProgresoMaterialMedi;

import java.util.List;

@Repository
public interface ProgresoMaterialMediRepository extends JpaRepository<ProgresoMaterialMedi,Integer> {

}

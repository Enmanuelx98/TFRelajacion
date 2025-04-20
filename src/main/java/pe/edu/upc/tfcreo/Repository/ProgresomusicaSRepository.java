package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;
@Repository
public interface ProgresomusicaSRepository extends JpaRepository<ProgresomusicaS, Integer> {
}

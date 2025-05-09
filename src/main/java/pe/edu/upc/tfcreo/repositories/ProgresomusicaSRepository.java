package pe.edu.upc.tfcreo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.entities.ProgresomusicaS;

@Repository
public interface ProgresomusicaSRepository extends JpaRepository<ProgresomusicaS, Integer> {
}

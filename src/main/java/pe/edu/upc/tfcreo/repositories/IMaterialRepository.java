package pe.edu.upc.tfcreo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.entities.Material;


@Repository
public interface IMaterialRepository extends JpaRepository<Material, Integer> {
}

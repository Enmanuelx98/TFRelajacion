package pe.edu.upc.tfcreo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.entities.Membresia;


@Repository
public interface IMembresiaRepository extends JpaRepository<Membresia, Long> {
}

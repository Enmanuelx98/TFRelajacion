package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaCategoriaRepository extends JpaRepository<MusicaCategoria, Integer> {
}

package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.MusicaCategoria;

@Repository
public interface MusicaCategoriaRepository extends JpaRepository<MusicaCategoria, Integer> {
   @Query("Select a from MusicaCategoria  a where a.nombreCategoria like  %:n%")
    public List<MusicaCategoria> BuscarPorNombre(String n);

}

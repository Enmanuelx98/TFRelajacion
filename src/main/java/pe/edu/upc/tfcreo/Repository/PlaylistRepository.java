package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.Playlist;
@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
  @Query("Select a from MusicaRelajacion  a where a.nombreMusica like  %:n%")
    public List<MusicaRelajacion> BuscarPorNombre(String n);

}

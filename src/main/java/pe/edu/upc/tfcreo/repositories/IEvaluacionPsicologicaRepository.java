package pe.edu.upc.tfcreo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.entities.EvaluacionPsicologica;


@Repository
public interface IEvaluacionPsicologicaRepository extends JpaRepository<EvaluacionPsicologica, Integer> {
}

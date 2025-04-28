package pe.edu.upc.tfcreo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.entities.Pagos;


import java.util.List;

@Repository
public interface IPagosRepository extends JpaRepository<Pagos, Integer> {

    @Query(value = "SELECT \n" +
            " COUNT(*) AS cantidad_total_pagos,\n" +
            " SUM(monto_pagos) AS suma_total_montos\n" +
            " FROM \n" +
            " pagos\n" +
            " WHERE \n" +
            " fecha_pagos >= CURRENT_DATE - INTERVAL '3 months';",nativeQuery = true)
    public List<String[]>montototalen3meses();

}





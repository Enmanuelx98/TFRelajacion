package pe.edu.upc.tfcreo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.entities.Tarjeta;


@Repository
public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer> {

    @Query(value = "SELECT \n" +
            " SUM(p.monto_pagos) AS monto_total_pagadotarjeta\n" +
            " FROM \n" +
            " pagos p\n" +
            " INNER JOIN \n" +
            " tarjeta t ON p.id_pagos = t.id_pagos\n" +
            " WHERE \n" +
            " p.fecha_pagos >= CURRENT_DATE - INTERVAL '3 months'\n" +
            " AND t.id_tarjeta IS NOT NULL;\n",nativeQuery = true)
     double montototatarjetaen3meses();
}

package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.Tarjeta;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer> {

    @Query(value = "SELECT \n" +
            " SUM(p.monto_pagos) AS monto_total_tarjeta\n" +
            " FROM \n" +
            " pagos p\n" +
            " INNER JOIN \n" +
            " tarjeta t ON t.idpagos = p.id_pagos\n" +
            " WHERE \n" +
            " p.fecha_pago BETWEEN '2025-03-02' AND '2025-05-05';",nativeQuery = true)
    double montototatarjetaen3meses();

}

package pe.edu.upc.tfcreo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.entities.BilleteraElectronica;


@Repository
public interface IBilleteraElectronicaRepository extends JpaRepository<BilleteraElectronica,Integer> {

    @Query(value = "SELECT \n" +
            " SUM(p.monto_pagos) AS monto_total_pagado_billetera\n" +
            " FROM \n" +
            " pagos p\n" +
            " INNER JOIN \n" +
            " billetera_electronicas b ON p.id_pagos = b.id_pagos\n" +
            " WHERE \n" +
            "  p.fecha_pagos BETWEEN '2025-02-02' AND '2025-06-02'" +
            " AND b.id_billetera_electronica IS NOT NULL;",nativeQuery = true)
    double montototabilleteraen3meses();

}

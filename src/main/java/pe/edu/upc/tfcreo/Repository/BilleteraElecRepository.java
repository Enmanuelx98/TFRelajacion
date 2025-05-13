package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.BilleteraElectronica;
@Repository
public interface BilleteraElecRepository extends JpaRepository<BilleteraElectronica, Integer> {
    @Query(value = "SELECT \n" +
            " SUM(p.monto_pagos) AS monto_total_billetera\n" +
            " FROM \n" +
            " pagos p\n" +
            " INNER JOIN \n" +
            " billeteraelectronica b ON b.idpagos = p.id_pagos\n" +
            " WHERE \n" +
            " p.fecha_pago BETWEEN '2025-03-02' AND '2025-05-05';\n",nativeQuery = true)
    double montototabilleteraen3meses();
}

package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.Pagos;

import java.util.List;

@Repository
public interface PagosRepository extends JpaRepository<Pagos, Integer> {

    @Query(value = " SELECT \n" +
            " COUNT(*) AS cantidad_total_pagos,\n" +
            " SUM(p.monto_pagos) AS monto_total_pagado\n" +
            " FROM \n" +
            " pagos p\n" +
            " WHERE \n" +
            " p.fecha_pago >= CURRENT_DATE - INTERVAL '3 months';",nativeQuery = true)
    public List<String[]> montototalen3meses();
}

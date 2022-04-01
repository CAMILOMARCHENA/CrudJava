package com.CRUDPrueba.repo;

import com.CRUDPrueba.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SHAMILO
 */
@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {
    
    
    
}

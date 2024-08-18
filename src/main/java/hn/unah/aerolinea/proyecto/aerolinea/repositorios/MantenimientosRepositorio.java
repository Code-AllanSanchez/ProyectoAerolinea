package hn.unah.aerolinea.proyecto.aerolinea.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.aerolinea.proyecto.aerolinea.modelos.mantenimientos;

@Repository
public interface MantenimientosRepositorio extends JpaRepository<mantenimientos, Long>{
    
}

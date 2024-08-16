package hn.unah.aerolinea.proyecto.aerolinea.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.aerolinea.proyecto.aerolinea.modelos.Silla;

public interface SillaRepositorio extends JpaRepository<Silla, Long>{
    
}

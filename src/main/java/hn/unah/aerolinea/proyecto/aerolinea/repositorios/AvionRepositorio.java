package hn.unah.aerolinea.proyecto.aerolinea.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.aerolinea.proyecto.aerolinea.modelos.Avion;

public interface AvionRepositorio extends JpaRepository<Avion, String>{
    
}

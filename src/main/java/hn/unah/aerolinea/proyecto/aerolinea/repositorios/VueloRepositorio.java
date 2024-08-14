package hn.unah.aerolinea.proyecto.aerolinea.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.aerolinea.proyecto.aerolinea.modelos.Vuelo;

public interface VueloRepositorio extends JpaRepository<Vuelo, Long>{
    
}

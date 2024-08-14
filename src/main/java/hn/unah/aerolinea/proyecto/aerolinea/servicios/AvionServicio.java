package hn.unah.aerolinea.proyecto.aerolinea.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.aerolinea.proyecto.aerolinea.modelos.Avion;
import hn.unah.aerolinea.proyecto.aerolinea.modelos.Vuelo;
import hn.unah.aerolinea.proyecto.aerolinea.repositorios.AvionRepositorio;

@Service
public class AvionServicio {
    
    @Autowired
    private AvionRepositorio avionRepositorio;

    public Avion nuevoAvion(Avion nuevoAvion){
        if (this.avionRepositorio.existsById(nuevoAvion.getCodigoAvion())){
            return null;
        }
        
        List<Vuelo> vuelos = nuevoAvion.getVuelos();
        if(vuelos != null){
            for (Vuelo v : vuelos){
                v.setAvion(nuevoAvion);
            }
        }

        return this.avionRepositorio.save(nuevoAvion);
    }
}

package hn.unah.aerolinea.proyecto.aerolinea.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.aerolinea.proyecto.aerolinea.modelos.Ciudad;
import hn.unah.aerolinea.proyecto.aerolinea.repositorios.CiudadRepositorio;

@Service
public class CiudadServicio {

    @Autowired
    CiudadRepositorio ciudadRepositorio;
    
    public Ciudad crearCiudad(Ciudad nuevaCiudad){
        if(this.ciudadRepositorio.existsById(nuevaCiudad.getCodigoCiudad())){
            return null;
        }
        return this.ciudadRepositorio.save(nuevaCiudad);
    }
    
    public Ciudad buscarCiudad(Ciudad ciudad){
        if(this.ciudadRepositorio.existsById(ciudad.getCodigoCiudad())){
            return this.ciudadRepositorio.findById(ciudad.getCodigoCiudad()).get();
        }else{
            return null;
        }
    }

}

package hn.unah.aerolinea.proyecto.aerolinea.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.aerolinea.proyecto.aerolinea.modelos.Avion;
import hn.unah.aerolinea.proyecto.aerolinea.modelos.Vuelo;
import hn.unah.aerolinea.proyecto.aerolinea.repositorios.VueloRepositorio;

@Service
public class VueloServicio {
    
    @Autowired
    VueloRepositorio vueloRepositorio;

    public Vuelo crearVuelo(Vuelo nuevoVuelo){
        if(this.vueloRepositorio.existsById(nuevoVuelo.getNumeroVuelo())){
            return null;
        }

        Avion  Av= nuevoVuelo.getAvion();
        if ( Av != null){
            Av.getVuelos().add(nuevoVuelo);
        }

        return this.vueloRepositorio.save(nuevoVuelo);
    }

    public Vuelo modificarVuelo(long numVuelo, Vuelo vuelo){
        if (this.vueloRepositorio.existsById(numVuelo)){
            Vuelo vueloActualizar = this.vueloRepositorio.findById(numVuelo).get();
            vueloActualizar.setAvion(vuelo.getAvion());
            vueloActualizar.setOrigen(vuelo.getOrigen());
            vueloActualizar.setDestino(vuelo.getDestino());
            vueloActualizar.setFechaSalida(vuelo.getFechaSalida());
            vueloActualizar.setFechaRegreso(vuelo.getFechaRegreso());
            vueloActualizar.setHoraLlegada(vuelo.getHoraLlegada());
            vueloActualizar.setHoraSalida(vuelo.getHoraSalida());
            this.vueloRepositorio.save(vueloActualizar);
            return vueloActualizar;
        }
        return null; 

    }

    public Vuelo buscarVuelo(long id){
        return this.vueloRepositorio.findById(id).get();
    }

    //Por terminar
    public Vuelo reservarVuelo(long numVuelo){
        Vuelo vueloReserva = this.vueloRepositorio.findById(numVuelo).get();
        return vueloReserva;
    }
}

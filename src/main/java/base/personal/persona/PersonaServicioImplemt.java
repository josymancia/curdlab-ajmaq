package base.personal.persona;

import base.personal.dao.PersonaRepositorio;
import base.personal.dao.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicioImplemt implements PersonaServicio {
    @Autowired
    private PersonaRepositorio repositorio;
    @Override
    public List<Personal> personaAgregada() {
        return repositorio.findAll();
    }

    //@Override
    //public Personal personaAgregadaId(Long id) {
       // return null;
    //}
}

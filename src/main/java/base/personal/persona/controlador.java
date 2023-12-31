package base.personal.persona;

import base.personal.dao.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/tbl_ingresopersonas"})
public class controlador {
    @Autowired
    PersonaServicio servicio;
    @GetMapping
    public List<Personal>personaAgregada(){
        return servicio.personaAgregada();
    }



}

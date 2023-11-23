package base.personal.dao;

import base.personal.persona.Personal;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonaRepositorio extends Repository<Personal, Long> {
    List<Personal>findAll();
    //Personal findOne(Long id);
    //Personal save(Personal p);
    //void delete(Personal p);

}

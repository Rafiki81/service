package com.rafiki.service.repositories;

import com.rafiki.service.entities.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlumnoRepository extends CrudRepository<Alumno,Long> {

    //CRUD: CREATE READ UPDATE DELETE


}

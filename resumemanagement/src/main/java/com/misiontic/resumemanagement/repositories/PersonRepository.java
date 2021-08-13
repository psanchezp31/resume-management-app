package com.misiontic.resumemanagement.repositories;

import com.misiontic.resumemanagement.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}

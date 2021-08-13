package com.misiontic.resumemanagement.repositories;

import com.misiontic.resumemanagement.models.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}

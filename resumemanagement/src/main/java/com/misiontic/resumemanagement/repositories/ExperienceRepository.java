package com.misiontic.resumemanagement.repositories;

import com.misiontic.resumemanagement.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}

package com.example.backend.tutor;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public class TutorRepository extends JpaRepository<TutorModel, Long>{
    
}

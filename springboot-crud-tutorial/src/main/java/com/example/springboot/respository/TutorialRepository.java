package com.example.springboot.respository;

import com.example.springboot.model.Tutorial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;
import java.util.List;

//We extend to JpaRepository to call its methods.
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    //Custom methods
    Page<Tutorial> findByPublished(boolean published, Pageable pageable); //Returns all tutorials with published having values
    Page<Tutorial> findByTitleContaining(String title, Pageable pageable); //Returns all tutorials containing the string value

    List<Tutorial> findByTitleContaining(String title, Sort sort);
}

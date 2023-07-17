package com.example.springboot.service;

import com.example.springboot.model.Tutorial;
import com.example.springboot.respository.TutorialRepository;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class TutorialServiceImpl {

    TutorialRepository tutorialRepository;


    /*public ResponseEntity<List<Tutorial>> getAllTutorials(String id, String desc, String[] sort){


        List<Tutorial> tutorials = tutorialRepository.findAll(Sort.by(orders));
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }*/
}

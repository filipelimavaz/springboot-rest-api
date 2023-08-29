package br.com.controllers;

import br.com.entities.Person;
import br.com.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("{id}")
    public ResponseEntity<Person> returnSpecificCourse(@PathVariable String id) {
        return new ResponseEntity<>(personService.returnSpecificCourseById(id), HttpStatus.OK);
    }


}

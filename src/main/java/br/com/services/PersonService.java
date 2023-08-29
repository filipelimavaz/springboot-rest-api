package br.com.services;

import br.com.entities.Person;
import br.com.repositories.PersonRepository;
import br.com.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private Validator validor;


    public Person returnSpecificCourseById(String id) {
        validor.isIdValid(id);
        Optional<Person> optionalPerson = personRepository.findById(Long.parseLong(id));
        Person person = optionalPerson.get();
        return person;
    }
}

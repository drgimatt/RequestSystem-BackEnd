package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Person;
import com.rijai.LocationApi.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements IPersonService {
    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> getPersons() {
        return (List<Person>) repository.findAll();
    }

    @Override
    public Person createPerson(Person person) {
        return repository.save(person);
    }

    @Override
    public Person updatePerson(Long id, Person person) {
        Optional<Person> existingPerson = repository.findById(id);
        if(existingPerson.isPresent()) {
            return repository.save(person);
        }
        else
            return null;
    }

    @Override
    public void deletePerson(Long id) {
        Optional<Person> person = repository.findById(id);
        if(person.isPresent()) {
            repository.delete(person.get());
        }
    }

    @Override
    public Person findById(Long id) {
        Optional<Person> person = repository.findById(id);
        return person.orElse(null);
    }

    @Override
    public Person getPerson(Long id) {
        Optional<Person> optional=repository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Person) optional.get();
    }    

}

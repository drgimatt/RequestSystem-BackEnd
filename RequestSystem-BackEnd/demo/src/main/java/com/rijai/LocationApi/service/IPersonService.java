package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Person;

import java.util.List;


public interface IPersonService {

    List<Person> getPersons();
    //Student doesStudentExist(String username, String password);
    Person createPerson(Person person);
    Person updatePerson(Long id, Person person);
    void deletePerson(Long id);
    Person findById(Long id);
    Person getPerson(Long id);
}
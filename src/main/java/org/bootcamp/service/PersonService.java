package org.bootcamp.service;

import org.bootcamp.model.Person;

import java.util.List;

public interface PersonService {
    void addPerson(Person p);
    void updatePerson(Person p);
    List<Person> listPerson();
    Person getPersonById(int id);
    void removePerson(int id);
}

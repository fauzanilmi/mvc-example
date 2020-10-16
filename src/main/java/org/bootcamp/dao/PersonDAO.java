package org.bootcamp.dao;

import org.bootcamp.model.Person;

import java.util.List;

public interface PersonDAO {
    void addPerson(Person p);
    void updatePerson(Person p);
    List<Person> listPerson();
    Person getPersonById(int id);
    void removePerson(int id);
}

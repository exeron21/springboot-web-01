package win.bojack.springboot.service;

import win.bojack.springboot.model.Person;

import java.util.List;

public interface PersonService {

    int update();

    List<Person> getAllPerson();
}

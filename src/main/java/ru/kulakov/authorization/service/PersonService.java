package ru.kulakov.authorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kulakov.authorization.entity.Person;
import ru.kulakov.authorization.repo.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;
    public Person registration(Person person) throws  Exception{
        if (personRepo.findByUsername(person.getUsername()) != null){
            throw new Exception("Такой уже есть");
        }
        return personRepo.save(person);
    }
}

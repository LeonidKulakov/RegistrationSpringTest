package ru.kulakov.authorization.repo;

import org.springframework.data.repository.CrudRepository;
import ru.kulakov.authorization.entity.Person;

public interface PersonRepo extends CrudRepository<Person, Long> {
    Person findByUsername(String username);
}

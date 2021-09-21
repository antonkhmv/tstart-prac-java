package tstart.prac.demo.repository;

import tstart.prac.demo.model.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findCustomerById(Integer id);
}
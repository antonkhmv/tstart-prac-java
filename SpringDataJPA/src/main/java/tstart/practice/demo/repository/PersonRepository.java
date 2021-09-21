package tstart.practice.demo.repository;


import org.springframework.data.repository.CrudRepository;
import tstart.practice.demo.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findCustomerById(Integer id);
}
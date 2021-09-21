package tstart.prac.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tstart.prac.demo.model.Person;
import tstart.prac.demo.repository.PersonRepository;

@RequestMapping("api/")
@RestController
public class PersonController {

    @Autowired
    private PersonRepository customerRepository;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String name) {
        Person customer = new Person();
        customer.setName(name);
        customerRepository.save(customer);
        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<Person> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Person findCustomerById(@PathVariable Integer id) {
        return customerRepository.findCustomerById(id);
    }
}
package milestone.spring.customer.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import milestone.spring.customer.project.entity.Customer;
import milestone.spring.customer.project.service.CustomerService;

@RestController
public class CustomerController {


	@Autowired
	private CustomerService service;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
	@GetMapping("/customers") 
	public List<Customer> getAllCustomer(){
		return service.getCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public Customer findCustomerById(@PathVariable("id") int id) {
		return service.getCustomerById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return service.deleteCustomer(id);
	}
}

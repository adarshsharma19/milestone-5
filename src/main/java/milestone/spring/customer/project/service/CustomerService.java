package milestone.spring.customer.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import milestone.spring.customer.project.entity.Customer;
import milestone.spring.customer.project.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;
	
    
    public CustomerRepository getRepository() {
		return repository;
	}

	public void setRepository(CustomerRepository repository) {
		this.repository = repository;
	}

	public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }
    
    public List<Customer> getCustomers(){
    	return repository.findAll();
  
    }
    
    public Customer getCustomerById(int id){
    	return repository.findById(id).orElse(null);
    }
    
    public String deleteCustomer(int id) {
    	repository.deleteById(id);
    	return "Customer with id "+id+" deleted Succesfully";
    }
    
}

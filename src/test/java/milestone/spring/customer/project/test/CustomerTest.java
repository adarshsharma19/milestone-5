package milestone.spring.customer.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import milestone.spring.customer.project.repository.CustomerRepository;
import milestone.spring.customer.project.service.CustomerService;

@SpringBootTest
public class CustomerTest {
	
	@Autowired
	private CustomerService s;
	
	@MockBean
	private CustomerRepository r;
	
	@Test
	public void TestCode() {
		
		
		String result="Customer with id 2 deleted Succesfully";
     	assertEquals(s.deleteCustomer(2), result);
     	
     	assertEquals(s.getCustomerById(10), null);
		
/*		String output="{\r\n"
				+ "    \"id\": 2,\r\n"
				+ "    \"name\": \"Aman\",\r\n"
				+ "    \"gender\": \"Male\",\r\n"
				+ "    \"age\": 24,\r\n"
				+ "    \"preferredfood\": \"Veg\"\r\n"
				+ "}";
		
		Customer c=new Customer(2,"Aman","Male",24,"Veg");
			assertEquals(s.saveCustomer(c), output);
*/
	}

}

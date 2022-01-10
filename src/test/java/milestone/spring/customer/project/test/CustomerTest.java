package milestone.spring.customer.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import milestone.spring.customer.project.service.CustomerService;

@SpringBootTest
public class CustomerTest {
	
	@Autowired
	CustomerService s=new CustomerService();
	
	@Test
	public void TestCode() {
		
		String result="Customer with id 2 deleted Succesfully";
		assertEquals(s.deleteCustomer(2), result);
	}

}

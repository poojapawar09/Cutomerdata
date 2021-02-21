package com.pooja.customerdata.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pooja.customerdata.dal.entities.Customer;
import com.pooja.customerdata.dal.repos.CustomerRepository;



@SpringBootTest
class CustomerdataApplicationTests {
	
	@Autowired
	private CustomerRepository repo;
	
	@Test
	void testCustomerCreate() {
		Customer customer = new Customer();
		customer.setName("Komal");
		customer.setEmail("komal.pawar6@gmail.com");
		repo.save(customer);
	}
	
	@Test
	void testFindCustomerById() {

		Customer customer=repo.findById(1).get();
		System.out.println(customer);
	}
	
	@Test
	void testUpdateCutomer() {
		
		Customer customer=repo.findById(3).get();
		customer.setName("Pooja");
		customer.setEmail("pooja.pawar@gmail.com");
		repo.save(customer);
	}

	@Test
	void testDeleteCustomer() {
	
		Customer customer=repo.findById(3).get();
		repo.deleteById(3);
		
	}
	
}

package com.beginner_guide.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class Application {

	private final CustomerRepository customerRepository;

	public Application(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/** Part 1
	@GetMapping("")
	public String greet() {
		return "Hello";
	}

	record GreetResponse(String greet) {}

	class GreetResponse {
		private final String greet;

		public GreetResponse(String greet) {
			this.greet = greet;
		}

		public String getGreet() {
			return greet;
		}

		@Override
		public String toString() {
			return "GreetResponse{" +
					"greet='" + greet + '\'' +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			GreetResponse that = (GreetResponse) o;
			return Objects.equals(greet, that.greet);
		}

		@Override
		public int hashCode() {
			return Objects.hashCode(greet);
		}
	}

	@GetMapping("/greet")
	public GreetResponse greet() {
		return new GreetResponse("Hello");
	}

	record Person(String name, Integer age, double savings) {}

	record GreetResponse(String greet,
						 List<String> languages,
						 Person person) {}

	@GetMapping("/")
	public GreetResponse greet() {
		GreetResponse resposne = new GreetResponse(
				"Hello",
				List.of("C", "Java", "C++", "C#"),
				new Person("Alex", 23, 1200.0)
		);
		return resposne;
	}*/

	@GetMapping
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	record NewCustomerRequest(
			String name,
			String email,
			Integer age
	) {}

	@PostMapping
	public void addCustomer(@RequestBody NewCustomerRequest request) {
		Customer customer = new Customer();
		customer.setName(request.name);
		customer.setEmail(request.email);
		customer.setAge(request.age);
		customerRepository.save(customer);
	}

	@DeleteMapping("{customerId}")
	public void deleteCustomer(@PathVariable("customerId") Integer id) {
		customerRepository.deleteById(id);
	}

	// Exercise
	@PutMapping("{customerId}")
	public void updateCustomer(@PathVariable("customerId") Integer id,
							   @RequestBody NewCustomerRequest request) {
		Customer customer = customerRepository.getById(id);
		customer.setName(request.name);
		customer.setEmail(request.email);
		customer.setAge(request.age);
		customerRepository.save(customer);
	}
}

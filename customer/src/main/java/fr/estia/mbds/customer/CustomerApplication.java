package fr.estia.mbds.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            List<Customer> customersList = List.of(
                    Customer.builder().firstName("John").lastName("Doe").email("johnDoe@uca.fr").build(),
                    Customer.builder().firstName("Alice").lastName("Plane").email("alicePlane@uca.fr").build(),
                    Customer.builder().firstName("Michel").lastName("Alfred").email("michelAlfred@uca.fr").build(),
                    Customer.builder().firstName("Nina").lastName("Pola").email("ninaPola@uca.fr").build()
            );
            customerRepository.saveAll(customersList);
        };
    }
}

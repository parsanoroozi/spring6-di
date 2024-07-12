package org.example.spring6di.repositories;

import org.example.spring6di.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testSaveCustomer() {
        Customer savedCustomer = customerRepository.save(Customer.builder()
                .name("new Name")
                .build());

        assertThat(savedCustomer).isNotNull();
        assertThat(savedCustomer.getId()).isNotNull();
    }

}

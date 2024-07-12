package org.example.spring6di.mappers;

import org.example.spring6di.entities.Customer;
import org.example.spring6di.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}

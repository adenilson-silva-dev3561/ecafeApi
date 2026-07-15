package eCafe.API.customers.service.impl;

import eCafe.API.common.constants.ExceptionMessages;
import eCafe.API.common.constants.LogMessages;
import eCafe.API.customers.dto.CustomerRequest;
import eCafe.API.customers.dto.CustomerResponse;
import eCafe.API.customers.entity.Customer;
import eCafe.API.customers.repository.CustomerRepository;
import eCafe.API.customers.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerResponse create(CustomerRequest request) {

        log.info(LogMessages.CUSTOMER_CREATE_START, request.name());

        if (customerRepository.existsByCpf(request.cpf())) {

            log.warn(LogMessages.CUSTOMER_ALREADY_EXISTS, request.cpf());
            throw new RuntimeException(ExceptionMessages.CUSTOMER_ALREADY_EXISTS + request.cpf());
        }


        Customer customer = Customer.builder().name(request.name()).email(request.email()).cpf(request.cpf()).phone(request.phone()).createdAt(LocalDate.now()).birthDate(request.birth_date()).active(true).build();

        Customer customerSaved = customerRepository.save(customer);

        log.info(LogMessages.CUSTOMER_CREATE_SUCCESS, customerSaved.getId());

        return toDto(customerSaved);

    }

    private CustomerResponse toDto(Customer dto) {
        return new CustomerResponse(
                dto.getId(),
                dto.getName(),
                dto.getEmail(),
                dto.getPhone(),
                dto.getCreatedAt(),
                dto.getCpf(),
                dto.getBirthDate(),
                dto.isActive()
        );
    }
}

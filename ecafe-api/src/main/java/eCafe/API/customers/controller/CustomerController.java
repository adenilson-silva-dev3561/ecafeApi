package eCafe.API.customers.controller;

import eCafe.API.common.constants.ApiRoutes;
import eCafe.API.customers.dto.CustomerRequest;
import eCafe.API.customers.dto.CustomerResponse;
import eCafe.API.customers.service.CustomerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(ApiRoutes.CUSTOMER)
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerResponse> create(@Valid @RequestBody CustomerRequest dto) {

        CustomerResponse customer = customerService.create(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerResponse> update(@PathVariable Long id, @Valid @RequestBody CustomerRequest request) {

        CustomerResponse customerUpdated = customerService.update(id, request);

        return ResponseEntity.status(HttpStatus.OK).body(customerUpdated);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findCustomerById(@Valid @PathVariable Long id) {
        CustomerResponse customerId = customerService.findCustomerById(id);

        return ResponseEntity.ok(customerId);
    }
}

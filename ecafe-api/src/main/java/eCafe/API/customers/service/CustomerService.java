package eCafe.API.customers.service;

import eCafe.API.customers.dto.CustomerRequest;
import eCafe.API.customers.dto.CustomerResponse;

public interface CustomerService {

    CustomerResponse create(CustomerRequest request);
}

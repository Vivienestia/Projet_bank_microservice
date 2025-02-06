package fr.estia.mbds.customer;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> findAll();
    CustomerDTO findById(Long id);
}

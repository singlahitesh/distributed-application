package com.learning.repository;

import com.learning.model.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * @author hitesh.singla
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

}

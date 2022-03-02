package com.cg.repository;

import com.cg.model.Customer;
//import com.cg.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
//    Iterable<Customer> findAllByProvince(Province province);
//    Page<Customer> findAllByFullNameContaining(String fullName, Pageable pageable);
}

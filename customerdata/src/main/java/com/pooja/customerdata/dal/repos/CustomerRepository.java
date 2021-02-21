package com.pooja.customerdata.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.pooja.customerdata.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}

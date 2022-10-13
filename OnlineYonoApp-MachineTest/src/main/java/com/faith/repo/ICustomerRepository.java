package com.faith.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.CrudRepository;

import com.faith.model.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> {
	
	int depositAmount = 1500;
	//balance update
	@Query("UPDATE Customer SET balance WHERE customerId= ?1")
	 public Optional <Customer> getACustomerById(int Id);


}

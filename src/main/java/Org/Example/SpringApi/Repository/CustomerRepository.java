package Org.Example.SpringApi.Repository;

import Org.Example.SpringApi.Entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
package Org.Example.SpringApi.Repository;

import Org.Example.SpringApi.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order, Long> {
}

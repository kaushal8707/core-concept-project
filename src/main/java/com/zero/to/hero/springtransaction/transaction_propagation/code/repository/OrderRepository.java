package com.zero.to.hero.springtransaction.transaction_propagation.code.repository;

import com.zero.to.hero.springtransaction.transaction_propagation.code.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}

package com.zero.to.hero.springtransaction.transaction_propagation.code.repository;

import org.springframework.data.repository.CrudRepository;
import com.zero.to.hero.springtransaction.transaction_propagation.code.entity.Product;

public interface InventoryRepository extends CrudRepository<Product, Integer> {

}

package com.zero.to.hero.springtransaction.internal_working.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.zero.to.hero.springtransaction.internal_working.code.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

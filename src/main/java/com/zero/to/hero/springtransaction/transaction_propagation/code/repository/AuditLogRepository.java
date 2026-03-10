package com.zero.to.hero.springtransaction.transaction_propagation.code.repository;

import com.zero.to.hero.springtransaction.transaction_propagation.code.entity.AuditLog;
import org.springframework.data.repository.CrudRepository;

public interface AuditLogRepository extends CrudRepository<AuditLog, Long> {

}

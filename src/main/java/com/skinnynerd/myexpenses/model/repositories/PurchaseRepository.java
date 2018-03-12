package com.skinnynerd.myexpenses.model.repositories;

import com.skinnynerd.myexpenses.model.entities.Purchase;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PurchaseRepository extends CrudRepository<Purchase, UUID> {
}

package com.skinnynerd.myexpenses.model.repositories;

import com.skinnynerd.myexpenses.model.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
}

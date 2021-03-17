package com.tts.feedback.repository;

import com.tts.feedback.model.Role;
import com.tts.feedback.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByRole(String role);
}

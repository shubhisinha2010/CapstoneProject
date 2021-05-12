package com.example.demo.repository;

import com.example.demo.security.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}
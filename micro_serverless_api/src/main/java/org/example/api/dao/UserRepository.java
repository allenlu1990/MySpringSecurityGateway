package org.example.api.dao;

import org.example.api.component.UserDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDto,Long> {

    UserDto findByUsername(String username);

}
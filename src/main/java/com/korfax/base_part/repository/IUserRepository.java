package com.korfax.base_part.repository;

import com.korfax.base_part.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.login = :login")
    User getUserByLogin(@Param("login") String login);

}

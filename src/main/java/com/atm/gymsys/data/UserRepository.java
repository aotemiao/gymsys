package com.atm.gymsys.data;

import com.atm.gymsys.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<User, String> {

    User findByUserId(String username);
}

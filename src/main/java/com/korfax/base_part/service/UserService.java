package com.korfax.base_part.service;

import com.korfax.base_part.entity.User;
import com.korfax.base_part.repository.IUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public User getUserByLogin(String login) {
        User retVal = userRepository.getUserByLogin(login);
        log.debug("getUserByLogin return: "+ retVal.toString());
        return retVal;
    }

}

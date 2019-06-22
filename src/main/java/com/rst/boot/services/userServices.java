package com.rst.boot.services;

import com.rst.boot.domain.userDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //this is springboot service
public interface userServices {
    List<userDTO> findAllUsers(); //only declaer cant implement inside interface

    String saveUser(userDTO userData);

    String updateUser(userDTO newUserData);

    userDTO findById(Integer id);
}

package com.rst.boot.services.impl;

import com.rst.boot.domain.userDTO;
import com.rst.boot.repositories.userRepositories;
import com.rst.boot.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userServices {

    @Autowired //data service injection
    private userRepositories userRepositories;

    @Override //override the userServices findAllUsers() method
    public List<userDTO> findAllUsers() {
        //data base search....etc
        //return "all users";
        List<userDTO> allUsers=userRepositories.findAll(); //result put into the list
        return allUsers;
    }

    @Override
    public String saveUser(userDTO userData) {
        userRepositories.save(userData);
        return "Data Saved";
    }

    @Override
    public String updateUser(userDTO newUserData) {
        String msg=null;
        if(newUserData.getId()!=null){
            userRepositories.save(newUserData);
            msg="Data updated";
        }else{
            msg="Error";
        }
        return msg;
    }

    @Override
    public userDTO findById(Integer id) {
        return userRepositories.findOne(id);
    }
}

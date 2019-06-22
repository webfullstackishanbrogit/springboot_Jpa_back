package com.rst.boot.controllers;


import com.rst.boot.domain.userDTO;
import com.rst.boot.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //to declare API endpoint to application
@RequestMapping("/user") //to map localhost:8080/user or called as base mapping
@CrossOrigin //allow outside request which comes from angular side
public class user {

    @Autowired //userServices is dependancy injection for api end point
    private userServices userServices;

    @GetMapping("/all") //to map localhost:8080/user/hello
    public List<userDTO> allUsers(){   //return type must be list

        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody userDTO userData){

        return userServices.saveUser(userData);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody userDTO newUserData){
       return userServices.updateUser(newUserData);
    }
    @GetMapping("/find/{id}")
    public userDTO getUserById(@PathVariable Integer id){

        return userServices.findById(id);
    }
}

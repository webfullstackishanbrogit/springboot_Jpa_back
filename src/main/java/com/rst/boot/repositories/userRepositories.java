package com.rst.boot.repositories;

import com.rst.boot.domain.userDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepositories extends JpaRepository <userDTO,Integer>{

    //get all users,CRUD oprations...etc



}

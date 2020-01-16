package com.offcn.userprovider01.dao;

import com.offcn.userprovider01.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
package com.cims.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cims.entity.LoginDetails;

public interface LoginDetailsDao extends JpaRepository<LoginDetails, String>{

}

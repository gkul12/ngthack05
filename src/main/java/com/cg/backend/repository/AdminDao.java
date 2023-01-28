package com.cg.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backend.entity.Admin;



@Repository
public interface AdminDao extends JpaRepository<Admin,Integer>
{
	 Optional<Admin> findByEmail(String email);
	 Boolean existsByEmail(String email);
}
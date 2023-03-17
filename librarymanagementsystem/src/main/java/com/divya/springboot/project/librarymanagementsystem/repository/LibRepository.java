package com.divya.springboot.project.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divya.springboot.project.librarymanagementsystem.model.Library;

@Repository
public interface LibRepository extends JpaRepository <Library,Long>{

}

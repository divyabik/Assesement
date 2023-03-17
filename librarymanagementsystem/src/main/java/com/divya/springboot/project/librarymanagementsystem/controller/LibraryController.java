package com.divya.springboot.project.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divya.springboot.project.librarymanagementsystem.model.Library;
import com.divya.springboot.project.librarymanagementsystem.repository.LibRepository;

@RestController
@RequestMapping("api/")
public class LibraryController {
	
	@Autowired
	private LibRepository librep;
	
	@GetMapping("library")
	public List <Library> getLib(){
		return this.librep.findAll();
	}
	
}

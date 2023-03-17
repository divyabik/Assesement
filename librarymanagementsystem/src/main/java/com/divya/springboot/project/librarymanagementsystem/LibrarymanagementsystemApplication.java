package com.divya.springboot.project.librarymanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.divya.springboot.project.librarymanagementsystem.model.Library;
import com.divya.springboot.project.librarymanagementsystem.repository.LibRepository;

@SpringBootApplication
public class LibrarymanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementsystemApplication.class, args);
	}
	
	@Autowired
	private LibRepository librep;
	
	public void run(String...args) throws Exception {
		this.librep.save(new Library("Ikigai","Hector Garcia",235));
		this.librep.save(new Library("PonniyinSelvan","Kalki",2055));
		this.librep.save(new Library("Kazhivaraiyin Irugai","Latha",380));
		

	}

}

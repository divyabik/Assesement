package com.divya.springboot.project.librarymanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ibscno;
	
	@Column(name="Book_Name")
	private String bookname;
	
	@Column(name="Author_Name")
	private String authorname;
	
	private int pgno;
	
	public Library() {
		
	}
	

	public Library(String bookname, String authorname, int pgno) {
		super();
		this.bookname = bookname;
		this.authorname = authorname;
		this.pgno = pgno;
	}


	public int getIbscno() {
		return ibscno;
	}

	public void setIbscno(int ibscno) {
		this.ibscno = ibscno;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getPgno() {
		return pgno;
	}

	public void setPgno(int pgno) {
		this.pgno = pgno;
	}
	

}

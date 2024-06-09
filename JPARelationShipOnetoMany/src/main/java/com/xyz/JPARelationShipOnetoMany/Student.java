package com.xyz.JPARelationShipOnetoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy="student",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<LibraryBook>libraryBooks=new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<LibraryBook> getLibraryBooks() {
		return libraryBooks;
	}

	public void setLibraryBooks(List<LibraryBook> libraryBooks) {
		this.libraryBooks = libraryBooks;
	}
	
	public void addLibraryBook(LibraryBook book)
	{
		libraryBooks.add(book);
		book.setStudent(this);
	}
	public void removeLibraryBook(LibraryBook book)
	{
		libraryBooks.remove(book);
		book.setStudent(null);
	}
	
	
}

package com.ars.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Borrowing")
public class Borrowing {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowingId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "userId")
    private User User;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bookId")
    private Book Book;

    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private String status;
    
	public Long getBorrowingID() {
		return borrowingId;
	}
	public void setBorrowingId(Long borrowingId) {
		this.borrowingId = borrowingId;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		this.User = user;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		this.Book = book;
	}
	public LocalDate getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}

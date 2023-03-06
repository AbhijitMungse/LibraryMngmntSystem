package com.library;

import java.time.LocalDate;

public class BookIssueDetails {

	private int issueId;
	private String bookName;
	private String author;
	private LocalDate issueDate;
	private LocalDate returnDate;

	public BookIssueDetails(int issueId, String bookName, String author, LocalDate issueDate, LocalDate returnDate) {
		super();
		this.issueId = issueId;
		this.bookName = bookName;
		this.author = author;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "BookIssueDetails [issueId=" + issueId + ", bookName=" + bookName + ", author=" + author + ", issueDate="
				+ issueDate + ", returnDate=" + returnDate + "]";
	}

}
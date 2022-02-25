package com.junit.models;

import java.util.List;

public class Account {

	private String name;
	private String description;
	private List<Transaction> transactions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", description=" + description + ", transactions=" + transactions + "]";
	}

}

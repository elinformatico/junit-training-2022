package com.junit.models;

public class Transaction {

	private int idTransaction;
	private double monto;
	private String type;
	
	public int getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

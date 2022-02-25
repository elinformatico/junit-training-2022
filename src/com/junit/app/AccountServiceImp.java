package com.junit.app;

import java.util.ArrayList;
import java.util.List;

import com.junit.exceptions.ConnectionException;
import com.junit.interfaces.AccountService;
import com.junit.interfaces.FakeDataBaseService;
import com.junit.models.Account;
import com.junit.models.Connection;
import com.junit.models.Transaction;

public class AccountServiceImp implements AccountService, FakeDataBaseService {

	@Override
	public Account createNewAccount(Account account) {
		return account;
	}

	@Override
	public Account updateAccount(Account account) {
		account.setName("Jose Noe Hernandez Vivaco");
		return account;
	}

	@Override
	public boolean removeAccount(Account account) {
		account = null; // DAO Deleted
		return true;
	}

	@Override
	public List<Transaction> listAllTransactions(Account account) {
		
		List<Transaction> transactiones = new ArrayList<>();
		
		// Simulando agregar transacciones
		for(int i=0; i < 10; i++) {
			
			Transaction tran = new Transaction();
			tran.setIdTransaction(i);
			tran.setMonto(Math.random());
			tran.setType("gasto");
			
			transactiones.add(tran);
		}
		
		account.setTransactions(transactiones);
		return transactiones;
	}

	@Override
	public Connection generateConnection(String server, int port) {
		Connection newConnection = new Connection();
		newConnection.setServer(server);
		newConnection.setPort(port);
		return newConnection;
	}

	@Override
	public boolean isConnected(Connection connection) throws ConnectionException {
		
		boolean connected = (connection != null);
		if(connection == null) {
			throw new ConnectionException("No se pudo establecer la connection a la Base de Datos");
		}
		return connected;
	}

	@Override
	public boolean establishConnection() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
}

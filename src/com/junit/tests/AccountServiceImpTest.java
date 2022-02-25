package com.junit.tests;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.app.AccountServiceImp;
import com.junit.exceptions.ConnectionException;
import com.junit.models.Account;
import com.junit.models.Connection;
import com.junit.models.Transaction;

import static org.hamcrest.CoreMatchers.*;

class AccountServiceImpTest {

private static AccountServiceImp accountService;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		accountService = new AccountServiceImp();
	}

	@Test
	void testCreateNewAccount() {
		
		// Crear el objeto con los datos
		Account newAccount = new Account();
		newAccount.setName("Noe Hernandez");
		newAccount.setDescription("Cuenta Primaria");
		
		// Crear la cuenta con el uso del Servicio
		Account newAccountFromService = AccountServiceImpTest.accountService.createNewAccount(newAccount);
		// ---------------------------------------------
		
		// Assert con las validaciones
		assertNotNull(newAccountFromService);
		assertEquals(newAccount.getName(), newAccountFromService.getName());
		assertThat(newAccount, isA(Account.class));
	}
	
	@Test
	void testUpdateAccount() {
		
		// 
		Account oldAccount = new Account();
		oldAccount.setName("Jose Noe");
		oldAccount.setDescription("Esto es una descripcion");
		
		String nombre = oldAccount.getName();
		Account expectedAccount = new Account();
		expectedAccount = AccountServiceImpTest.accountService.updateAccount(oldAccount);
		
		// --- Assert
		assertThat(expectedAccount, isA(Account.class));
		assertNotEquals(nombre, expectedAccount.getName());
	}
	
	@Test
	void testRemove() {
		
		Account accountRemoved = new Account();
		accountRemoved.setName("Vegeta");
		accountRemoved.setDescription("Description");
		
		assertTrue(AccountServiceImpTest.accountService.removeAccount(accountRemoved));
	}
	
	@Test
	void testlistAllTransactions() {
		
		Account account = new Account();
		account.setName("Noe");
		
		List<Transaction> listTransactions =  AccountServiceImpTest.accountService.listAllTransactions(account);
		
		assertTrue(listTransactions.size() > 1);
	}
	
	
	@org.junit.Test(expected = ConnectionException.class)
	void connectionDataBaseTest() throws ConnectionException {
		
		AccountServiceImp newAccount = new AccountServiceImp();
		Connection newConnection = newAccount.generateConnection("https://elinformatico.net/api/getusers", 443);
		
		newAccount.isConnected(newConnection);
		
	}
	
	@Test
	@Timeout(value = 2, unit = TimeUnit.SECONDS)
	void validateTimeOut() {
		
		AccountServiceImpTest.accountService.establishConnection();
	}

}

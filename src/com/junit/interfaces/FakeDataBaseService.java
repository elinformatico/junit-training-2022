package com.junit.interfaces;

import com.junit.exceptions.ConnectionException;
import com.junit.models.Connection;

public interface FakeDataBaseService {

	public Connection generateConnection(String server, int port);
	public boolean isConnected(Connection connection) throws ConnectionException;
	public boolean establishConnection();
	
}

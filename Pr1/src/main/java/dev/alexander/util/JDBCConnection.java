package dev.alexander.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCConnection {
	private static Connection conn = null;

	public static Connection getConnection() {
		try {
			if (conn == null) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Properties props = new Properties();
				FileInputStream inp = new FileInputStream(
						JDBCConnection.class.getClassLoader().getResource("connection.properties").getFile());
				props.load(inp);
				String url = props.getProperty("url");
				String username = props.getProperty("username");
				String password = props.getProperty("password");

				conn = DriverManager.getConnection(url, username, password);
				return conn;
			} else {
				return conn;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		conn = getConnection();
		System.out.println(conn);
	}
}

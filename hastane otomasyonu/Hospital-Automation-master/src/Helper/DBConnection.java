package Helper;

import java.sql.*;

public class DBConnection {
	Connection c = null;

	public DBConnection() {
	}

	public Connection connDb() {
		try {
			this.c = DriverManager
					.getConnection("jdbc:mariadb://localhost:3325/hospital?user=root&password=123456");
			return c;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return c;
	}
}

package db;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCTest {

	Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	@Test
	public void testDriverClassLoad() {
		try {
			Class.forName("org.h2.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		
		String url = "jdbc:h2:tcp://localhost/D:/Job/Datas/toDoList/todoDB";
		String user = "sa";
		String pwd = "";
		
		try( Connection con =DriverManager.getConnection(url, user, pwd); ) {
			logger.info("testConnection - Get connection success!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

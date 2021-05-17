package insanevehicles.dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import insanevehicles.contract.IElement;
import insanevehicles.contract.IRoad;

public class DAOInsaneVehicles {
	private static String URL = "jdbc:mysql://localhost/insanevehicle";
	private static String LOGIN = "root";
	private static String PASSWORD = "";
	
	private Connection connection;
	private Statement statement;
	
	public DAOInsaneVehicles() {
		this.connection = null;
		this.statement = null;
	}
	
	public Boolean open() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(DAOInsaneVehicles.URL,DAOInsaneVehicles.LOGIN,PASSWORD);
			this.statement = this.connection.createStatement();
			
			System.out.println("|*--CONNECTION SUCCESS--|*");
			
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}
			return true;
		}
	
	public void close() {
		try {
			this.statement.close();
			System.out.println("FERMETURE ou UN TRUC COMME XA");
		}catch(SQLException e) {
			System.out.println("--!--SQL Error--!--");
			e.printStackTrace();
		}
		/*try {
			if (statement == null) {
				resultSet.close();
				statement.close();
				connection.close();
				
				System.out.println("|*--CONNECTION FAILURE--|*");
			}
		} catch (Exception e) {
			
		}*/
	}
	
	public IRoad getCircuitById(int id) {
		return null;
	}
	
	public void InsertCircuit(IRoad circuit) {
		this.executeUpdate(QueryCircuit.getQueryInsert(circuit));
		int lastCircuitId = this.getLastId();
		
		if(lastCircuitId != -1) {
			IElement element;
			for(int y=0;y<circuit.getHeight();y++) {
				for(int x=0;x<circuit.getWidth();x++) {
					element = circuit.getOnTheRoadXY(x, y);
					this.InsertMotionlessElement(element, x, y, lastCircuitId);
				}
				
			}
		}
	}
	
	public void InsertMotionlessElement(IElement element, int x, int y, int idCircuit) {
		this.executeUpdate(QueryMotionlessElements.getQueryInsert(element, x, y, idCircuit));
	}
	
	/* public void insertJavaPetri(final JavaPetri javaPetri) { 
		  	if (this.executeUpdate(QueryJavaPetri.getQueryInsert(javaPetri)) == 1) {   	 	
		  		final int idJavaPetri = this.getLastId();   
		  		
		  		if (idJavaPetri != -1) { 
		  	 	 	for (final 	JavaCell : javaCell javaPetri.getJavaCells()) { 
		  	 	 		this.executeUpdate(QueryJavaCell.getQueryInsert(javaCell, idJavaPetri)); 
		  	 	 	} 
		  	 	} 
		  	} 
		 } */

	
	
	
	private ResultSet executeQuery(String query) {
		ResultSet resultSet = null;
		try {
			resultSet  = this.statement.executeQuery(query);
		}catch(SQLException e) {
			System.out.println("--!--SQL Error--!--");
			e.printStackTrace();
		}
		
		return resultSet;
	}
	
	private int executeUpdate(String query) {
		int result = 0;
		try {
			result = this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
		}catch(SQLException e) {
			System.out.println("--!--SQL Error--!--");
			e.printStackTrace();
		}
		
		return result;
	}
	
	private int getLastId() {
		try {
			ResultSet resultSet = this.statement.getGeneratedKeys();
			if (resultSet.next()) {
			return resultSet.getInt(1);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}	

}

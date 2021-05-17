package insanevehicles.dao;

import insanevehicles.contract.IRoad;

class QueryCircuit {
	public static String getQueryInsert(IRoad circuit) {
		return "INSERT INTO `insanevehicle`.`circuits`(width, height) "
				+ "VALUES('"+circuit.getWidth()+"', '"+circuit.getHeight()+"');";
	}
	
	public static String getQuerySelectById(int id) {
		return "SELECT * FROM `insanevehicle`.`circuits`" + "WHERE id = "+id+";";
	}
	
	public static String getQuerySelectAll() {
		return "SELECT * FROM `insanevehicle`.`circuits`";
	}
}

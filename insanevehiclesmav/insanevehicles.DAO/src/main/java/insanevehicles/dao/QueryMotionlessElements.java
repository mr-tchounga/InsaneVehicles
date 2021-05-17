package insanevehicles.dao;

import insanevehicles.contract.IElement;

class QueryMotionlessElements {
	public static String getQueryInsert(IElement element, int x, int y, int idCircuit) {
		return "INSERT INTO `insanevehicle`.`motionlesselements`(name, x, y, idCircuit) "
				+ "VALUES('"+element.getName()+"', "+x+", "+y+", "+idCircuit+");";
	}
	
}

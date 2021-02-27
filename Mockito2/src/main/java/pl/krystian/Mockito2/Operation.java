package pl.krystian.Mockito2;

import java.util.List;

public class Operation {
	
	public List<Object> getObjectList() {
		DatabaseDAO databaseDAO = new DatabaseDAO();
		return databaseDAO.getList();
	}
	
	public int CountListSize(List<Object> object) {
		return object.size();
	}

}

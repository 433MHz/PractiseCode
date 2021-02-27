package pl.krystian.Mockito2;

import java.util.ArrayList;
import java.util.List;

public class DatabaseDAO {

	private List<Object> list = new ArrayList<Object>();

	public List<Object> getList() {
		return list;
	}
	
	public int AddObject(Object object) {
		list.add(object);
		return list.size();
	}
}

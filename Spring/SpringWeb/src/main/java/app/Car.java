package app;

public class Car {
	private String mark;
	private String model;
	
	
	public Car(String mark, String model) {
		super();
		this.mark = mark;
		this.model = model;
	}
	
	public String getMark() {
		return mark;
	}
	public String getModel() {
		return model;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public void setModel(String model) {
		this.model = model;
	}
}

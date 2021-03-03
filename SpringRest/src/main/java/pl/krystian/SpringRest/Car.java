package pl.krystian.SpringRest;

public class Car {

	private String model;
	private String mark;
	private String tires;
	private int year;
	
	
	
	
	public String getModel() {
		return model;
	}
	public String getMark() {
		return mark;
	}
	public String getTires() {
		return tires;
	}
	public int getYear() {
		return year;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public void setTires(String tires) {
		this.tires = tires;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

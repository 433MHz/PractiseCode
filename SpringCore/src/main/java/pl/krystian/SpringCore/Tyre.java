package pl.krystian.SpringCore;

public class Tyre {

	private String brand;
	private int size;

	
	public Tyre(int size) {
		this.size = size;
	}


	public String getBrand() {
		return brand;
	}


	public int getSize() {
		return size;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setSize(int size) {
		this.size = size;
	}
}

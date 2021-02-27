package pl.krystian.Mockito2;

public class Object {

	private String name;
	private String age;
	private String job;
	
	
	
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getJob() {
		return job;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	public Object(String name, String age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}
}

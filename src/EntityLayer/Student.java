package EntityLayer;

public class Student {
	private int Id;
	private String Name;
	private int Age;
	private String DOB;
	private String Class;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getCls() {
		return Class;
	}
	public void setCls(String cls) {
		Class = cls;
	}

}


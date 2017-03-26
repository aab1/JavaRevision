package lesson1;

public class Student {
	
	static int numberOfStudent = 0;
	final static String schoolName = "Army children school";
	
	Student(){
		numberOfStudent++;
	} 
	
	int id, age;
	String name;
//we generated the getters and setters by clicking source >generates getters an setters and select all.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

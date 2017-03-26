package lesson3;

public class NigerianMen implements Man{
	private String name;
	private int age;
	protected static int numberOfNigerianMen = 0;
	
	NigerianMen(String name, int age){
		this.name = name;
		this.age = age;
		numberOfNigerianMen++;
	}

	protected NigerianMen() {
		// this is for men whose identity is not known
		numberOfNigerianMen++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "Can walk";
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Can talk";
	}

	@Override
	public String breath() {
		// TODO Auto-generated method stub
		return "Can breath";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Can eat all sort of food";
	}

	@Override
	public String hasSperm() {
		// TODO Auto-generated method stub
		return "Can impregnate women";
	}

}

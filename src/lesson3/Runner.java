package lesson3;

public class Runner {

	public static void main(String[] args) {
		NigerianMen deafAndDumpNigerman = new NigerianMen();
		NigerianMen musa = new NigerianMen("musa", 26);
		
		deafAndDumpNigerman.setName("unknown");
		deafAndDumpNigerman.setAge(44);
		
		musa.breath();
		System.out.println("The number of nigerian men is "+NigerianMen.numberOfNigerianMen);
		

	}

}

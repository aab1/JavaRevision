package lesson6;

public class Try_catch {
	
	public static double divide(int a){
		double answer = 0;
		try{
			answer = 100/a;
			return answer;
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("finally was called and 20 will now be added to the answer");
			answer += 20;
			return answer;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(divide(4));

	}

}

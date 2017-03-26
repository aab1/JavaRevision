package threadDemo;

 class MyThreadClass extends Thread{

	public void run(){
		for(int i = 0; i< 10; i++ ){
			System.out.println(Thread.currentThread().getId()+" value "+ i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class MyClass {
	
	//All thread must have the run method
	//the method we are using here now is the subclassing method
	

	
	public static void main(String[] args) {
		
		MyThreadClass threadClassObject =  new MyThreadClass();
		threadClassObject.start();
		
		MyThreadClass threadClassObject1 =  new MyThreadClass();
		threadClassObject1.start();
	}

}

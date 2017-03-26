package lesson5;

import java.util.*;

public class HashsetTutorial {
	/*hashset doesn't keep duplicate
	 * it won't return error but it will only use one of them
	 * hashset work exactly like list*/
	public static void main(String args[]){
		HashSet<String> names = new HashSet<String>();
		try{
			//int test = 100/0; for try catch block
			//you can catch multiple exception
			names.add("yemi");
			names.add("mona");
			names.add("joshua");
			names.add("almut");
			names.add("lovet");
			
			Iterator<String> it = names.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			System.out.println("..........using for loop........................");
			for(String name: names){// for each name in names hashset
				System.out.println(name);
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("finially will always be executed");
			//you can stop finally from running if you type System.exit(1) in the try part
		}

	}
}

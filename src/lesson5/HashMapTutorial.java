package lesson5;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {

	static HashMap<String, Integer>mapMonths = new HashMap<>();
	public static void main(String[] args) {
		mapMonths.put("Jan", 1);
		mapMonths.put("Feb", 2);
		mapMonths.put("Mar", 3);
		mapMonths.put("April", 4);
		mapMonths.put("May", 5);
		mapMonths.put("June", 6);
		mapMonths.put("July", 7);
		mapMonths.put("August", 8);
		mapMonths.put("September", 9);
		mapMonths.put("October", 10);
		mapMonths.put("November", 11);
		mapMonths.put("December", 12);
		
		System.out.println("July is the number "+mapMonths.get("July")+" of the year");
		//####################################################
		if(mapMonths.containsKey("Jan")){
			System.out.println("Jan is the the hashMap");
		}
		//####################################################
		if (mapMonths.containsValue(10)){
			System.out.println("The value 10 is in the hashmap");
		}
		System.out.println();
		//####################################################
		System.out.println("loop through ther keys");
		for(String key:mapMonths.keySet()){
			System.out.println(key);
		}System.out.println();
		//####################################################
		System.out.println("loop through the values");
		for(Integer value:mapMonths.values()){
			System.out.println(value);
		}
		//####################################################
		System.out.println();
		System.out.println("Remove Jan from the map");
		mapMonths.remove("Jan");
		//####################################################
		
		System.out.println();
		System.out.println("loop through both the keys and the values as if it was a list");
		for(Map.Entry kv:mapMonths.entrySet()){
			System.out.println(kv);
		}
	}

}

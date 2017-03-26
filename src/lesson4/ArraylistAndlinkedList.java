package lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*System.out.println(System.currentTimeMillis()); .... helps to get the current time
 * java list gives you linkedlist and array list eventhough it implement the list interface
 * deletion and insertion operation --> linkedlist is better
 * search operation --> arraylist is better
 * note that list can contain duplicate element but hashset cannot*/
public class ArraylistAndlinkedList {
	public static void main(String args []){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		System.out.println("The size of the arraylist is "+myList.size());
		for (Integer x: myList){
			System.out.println(x);
		}
		
		System.out.println("####################..linked list...........#############################################");
		LinkedList<Integer> myLinkedlist = new LinkedList<Integer>();
		myLinkedlist.addAll(myList);
		//for each element named z in mylinkedlist do something
		for(Integer z: myLinkedlist){
			System.out.println(z+" is added to the linked list from the arraylist");
		}
		
		System.out.println("####################..linked list for strings...........################################");
		LinkedList<String> myStringLinkedlist = new LinkedList<String>();
		myStringLinkedlist.add("mum");
		myStringLinkedlist.add("child1");
		myStringLinkedlist.add("child2");
		myStringLinkedlist.add("child3");
		myStringLinkedlist.addFirst("dad");
		myStringLinkedlist.addLast("last child");
		myStringLinkedlist.add(5, "child4 inserted at index 5");
		myStringLinkedlist.set(1, "Mum");
		
		for(String a:myStringLinkedlist){
			System.out.println(a);
		}
		
		System.out.println("####################.......java list for strings...........################################");
		
		// java list
		/*you can add any data type to the list when it is created as shown below although it is a bad practice
		 * List anotherlist = new ArrayList();
		 * when u want to retireve data from this list u have to be casting to know what data type it is
		 * you can loop through list using iterator or for loop
		 * anotherlist.add("boy");
			anotherlist.add(13);
			A better example is shown below*/
		List<String> anotherlist = new ArrayList<String>();
		anotherlist.add("boy");
		anotherlist.add("girl");
		anotherlist.add("man");
		anotherlist.add("woman");
		/*we can also use ListIterator they all iterate the same way
		 * we have object hasNext() --> boolean
		 * next()
		 * hasPrevious()--> this will allow you to print from last to first but you will find it in ListIterator
		 * previous()*/
		Iterator<String> iterator = anotherlist.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("####################.......check if word exist in  strings...........################################");
		ArrayList<String> element = new ArrayList<String>();
		element.add("Audi A3 2.0 T FSI S LINE SPECIAL LINE 3DR Manual");
		element.add("Audi A3 1.6 TDI Sport 3dr");
		element.add("Audi A3 1.9 TDI E SPORT 3d 103 BHP");
		element.add("Audi A3 2.0 TDI Black Edition 3dr");
		element.add("Audi A3 2.0 TDI Black Edition 3dr");
		
		for(String check: element){
			if (check.contains("Audi")){
				System.out.println("The String contains audi");
			}
		}
		
		
		
	}
}

package collection;

import java.util.ArrayList;
import java.util.List;

public class Example_list {

	public static void main(String[] args) {
		List <String> li = new ArrayList<String>(); //list obj creation
		//System.out.println(li);
		//add() : to add elements in the collection
		
		li.add("Devi"); //index:0
		li.add("Sreehari");//index:1
		li.add("Yuvan");//index:2
		li.add("Sreehari");//index:3
		li.add(null);//4
		li.add(null);//5
		System.out.println(li);
		
		//index(): to return index of objects in a list
		System.out.println(li.indexOf("Devi"));

		System.out.println(li.lastIndexOf("Sreehari"));
		//get(): to get index position of an element
		System.out.println(li.get(0));
		//contains(): to check whether a elements is present in a list
		System.out.println(li.contains("Devi"));
		System.out.println(li.contains("Anu"));
		//isEmpty(): is list empty or not
		System.out.println(li.isEmpty());
		//size
		System.out.println(li.size());
		
		/*for(int i=0; i<li.size();i++) {
			System.out.println(li.get(i));
		}*/
		
		for(String s:li) {   //for each method for iteration
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}

}

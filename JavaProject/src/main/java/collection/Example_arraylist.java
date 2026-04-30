package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example_arraylist {

	
	public static void main(String[] args) {
		ArrayList <String> ar = new ArrayList<String>(); //arraylist obj creation
		System.out.println(ar);
		
		ar.add("Tiger"); //index:0
		ar.add("lion");//index:1
		ar.add("cat");//index:2
		ar.add("parrot");//index:3
		
		System.out.println(ar);
		
		ArrayList <String> ar1 = new ArrayList<String>();
		ar1.add("doctor"); //index:0
		ar1.add("teachr");//index:1
		ar1.add("adv");//index:2
		ar1.add("custom");//in
		System.out.println(ar1);
		
		//addall(): to add another list to current list
		ar1.addAll(ar);
		System.out.println(ar1);
		//containsall() :to check another list present in current list
		System.out.println(ar1.containsAll(ar));
		System.out.println(ar.containsAll(ar1));
		//remove()
		//ar.remove(0);
		//System.out.println(ar);
		ar1.removeAll(ar);
		System.out.println(ar1);
		//iterator
		Iterator it = ar1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(ar1);
		
		// TODO Auto-generated method stub

	}

}

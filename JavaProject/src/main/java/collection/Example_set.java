package collection;

import java.util.HashSet;
import java.util.Set;

public interface Example_set {
	
	public static void main(String args[]) {
		Set<String> name =  new HashSet<String>();
		name.add("devi");
		name.add("krishna");
		name.add("krishna");
		name.add("null");
		name.add("null");
		System.out.println(name);
		
				
	}
	

}

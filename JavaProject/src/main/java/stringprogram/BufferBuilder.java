package stringprogram;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		StringBuilder s2 = new StringBuilder("hi");
		System.out.println(s1);
		System.out.println(s2);
		//insert method: to insert a new word inside a string based on index position.
		
		System.out.println(s1.insert(5, " morning"));
		//append(): to addon a string to last of current string
		System.out.println(s1.append(" Anu"));
		//replace: to change characte/string to another character based on index position
		System.out.println(s1.replace(6,13,"evening"));
		//delete : to delete a string based on index position
		System.out.println(s1.delete(6,13));
		//reverse
		System.out.println(s2.reverse());
		// TODO Auto-generated method stub

	}

}

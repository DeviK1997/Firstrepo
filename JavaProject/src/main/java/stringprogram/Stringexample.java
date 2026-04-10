package stringprogram;

public class Stringexample {

	public static void main(String[] args) {
		String a ="Devi"; //literal way
		String b= new String("Anu"); //using new keyword
		String c = "";
		System.out.println(a);
		System.out.println(b);
		
		//1.length method (to find length of the string)
		System.out.println(a.length());
		// TODO Auto-generated method stub
        //2.charAt Method - to return character of string
		System.out.println(a.charAt(1));
		//3.concat method - to combine two string
		System.out.println(a.concat(b));
		System.out.println(a);//won't change as it is immutable
		//4.contains - to check whether a char or word present in a string
		System.out.println(a.contains("ev"));
		//5.toUpperCase() - lowecase to uppercase
		System.out.println(a.toUpperCase());
		//6.toLowerCase() 
	    System.out.println(a.toLowerCase());
	    //7.isEmpty() - to check whether a string is empty or not
	    System.out.println(a.isEmpty());
	    System.out.println(c.isEmpty());
	    //Equals
	    String d="java";
	    String e="java";
	    String f="Java";
	    System.out.println(d.equals(e));
	    System.out.println(d.equals(f));
	    //equalsignorecase
	    System.out.println(d.equalsIgnoreCase(f));
	    System.out.println(d==e);//true(since its in same reference)(get stored in console memory in heap memory)
	    String g= new String("devi");
	    String h= new String("devi");
	    System.out.println(g==h);//false(since its in diff reference)(directly get stored in heap memory)
	    //equal operator is used to comapare obj reference, meaning it checks 2 var points to same memory location
	    
	    //trim method - removing leading(frst) and trailing(last) space
	    String i = " Good Morning ";
	    System.out.println(i.trim());
	    //substring -to extract part of a string
	    System.out.println(i.substring(2));
	    System.out.println(i.substring(1,10));
	    
	    		
	}

	

}

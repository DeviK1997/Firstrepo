package super_keyword;

public class Childclass_variable extends Parentclass_variable{
String color1 = "red";
public void display()//instance method is used for this/super keywords
{
System.out.println("color is "+super.color1);	
}
	public static void main(String[] args) {
		Childclass_variable obj1 = new Childclass_variable();
		System.out.println("color is "+obj1.color1);
		obj1.display();
		// TODO Auto-generated method stub

	}

}

package encapsulation;

public class Childclass {

	public static void main(String[] args) {
		Parentclass obj = new Parentclass();
		obj.setName("Devi");
		System.out.println(obj.getName());
		
		obj.setRoll(25);
		System.out.println(obj.getRoll());
		obj.setMark(90);
		System.out.println(obj.getMark());
		obj.setSub("Maths");
		System.out.println(obj.getSub());
		
		
		// TODO Auto-generated method stub

	}

}

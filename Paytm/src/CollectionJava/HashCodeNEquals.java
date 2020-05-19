package CollectionJava;

public class HashCodeNEquals {

	public static void main(String[] args) {
		Human h1 = new Human(120893,null);
		Human h2 = new Human(120893,"Amit");
		
		Integer i = new Integer(10);
	
		int h1HashCode = h1.hashCode();
		int h2HashCode = h2.hashCode();
		
		System.out.println("HashCode of h1 "+h1HashCode);
		System.out.println("HashCode of h2 "+h2HashCode);
		
		System.out.println(h2.equals(h1));
		
		
		

	}

}

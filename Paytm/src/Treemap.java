import java.util.NavigableMap;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		 NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
	        
	      map.put(102,"Ravi");    
	      map.put(103,"Rahul");
	      map.put(100,"Amit"); 
	      map.put(101,"Vijay"); 
	      System.out.println("Orignal map :"+map);
	      
	      System.out.println("descendingMap: "+map.descendingMap()); 
	      
	      System.out.println("headMap: "+map.headMap(101,true));  
	      System.out.println("tailMap: "+map.tailMap(101,true));  
	      
	      
	      

	}

}

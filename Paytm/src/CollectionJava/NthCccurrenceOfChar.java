package CollectionJava;

public class NthCccurrenceOfChar {
public static void main(String[] args)
{
	String newStr = "ANAND MNAE";
	int tempIndex = -1;
	int finalIndex = 0;
	
	System.out.println("2nd occurrence of given character "+ newStr.indexOf('N', newStr.indexOf('N')+1));
	
	for(int occurrence = 0; occurrence < 3 ; occurrence++){
		tempIndex = newStr.indexOf('A');
		if(tempIndex==-1){
            finalIndex = 0;
            break;
        }
		newStr = newStr.substring(++tempIndex);
        finalIndex+=tempIndex;
	}
	
	if(finalIndex==0)
	{
		System.out.println("Chaacter not found ");
	}
	else
	System.out.println("finalIndex "+finalIndex);
}
}

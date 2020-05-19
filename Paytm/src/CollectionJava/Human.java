package CollectionJava;

import java.util.HashMap;

public class Human {
private String name;
private int udiNumber;

public Human( int udiNumber, String name) {
	this.name=name;
	this.udiNumber=udiNumber;
}

@Override
public int hashCode()
{
	return this.udiNumber;
}

@Override
public boolean equals(Object object)
{
	if(object==this)
	{
		return true;
	}
	if(object==null)
	{
		return false;
	}
	if(object.getClass()!=this.getClass())
	{
		return false;
	}
	Human humanObj = (Human) object;
	if(this.udiNumber!=humanObj.udiNumber)
	{
		return false;
	}
	if(this.name==null)
	{
		if(humanObj.name!=null)
		{
			return false;
		}
	}
	if(!this.name.equals(humanObj.name))
	{
		return false;
	}
	return true;
	
}


}

package CollectionJava;

public class Student {
	private String name;
	private int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " Id: " + this.id;

	}

	@Override
	public boolean equals(Object object)
	{
		
		return true;
		
	}
}

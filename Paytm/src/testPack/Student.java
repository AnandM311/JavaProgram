package testPack;

public class Student {

	private String studentName;
	private int studentMark;
	private int studenId;

	public Student(int studenId, String studentName, int studentMark) {
		this.studenId = studenId;
		this.studentName = studentName;
		this.studentMark = studentMark;
	}

	public int hashCode(int studenId) {
		return this.studenId;
	}

	public boolean equal(Object object) {
		Student otherObj = (Student) object;
		if (object == null) {
			return false;
		}
		if (object == this) {
			return true;
		}
		if (this.studenId != otherObj.studenId) {
			return false;
		}
		return true;

	}
	
	public String toString()
	{
		
		return   this.studentName+ " "+this.studenId+" "+ this.studentMark;
	}

}

package java1.ch7상속;



public class Student extends People{
	int stuedentNo;
	public Student( String name , String ssn , int studentNo ) {
		super(name,ssn);
		this.stuedentNo = studentNo;
	}
	
}

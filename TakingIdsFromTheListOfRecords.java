package Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	long rno;
	String name;
	String grade;
	public long getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student(long rno, String name, String grade) {
		super();
		this.rno = rno;
		this.name = name;
		this.grade = grade;
	}
	
	
	
}
public class TakingIdsFromTheListOfRecords {

	public static void main(String[] args)
	{
		List<Student> student=new ArrayList<>();
		student.add(new Student(101,"vijay","A"));
		student.add(new Student(102,"Raju","B"));
		student.add(new Student(103,"Ramu","C"));
		List<Long> studentIds=student.stream().map(Student::getRno).collect(Collectors.toList());
		System.out.println(studentIds);
		
		

	}

}

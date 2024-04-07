package javaassignment;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.set_info(1, "Om", "CSE", 456, "Pass", 'A');
		s.get_info();
		s.cal();
		s.display();
	}
}
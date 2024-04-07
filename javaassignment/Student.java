package javaassignment;

public class Student {

	public int rollno, mark;
	String name, course, result;
	char grade;

	void set_info(int rollno, String name, String course, int mark, String result, char grade) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.mark = mark;
		this.result = result;
		this.grade = grade;
	}

	void get_info() {
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(course);
		System.out.println(mark);
		System.out.println(grade);
		System.out.println(result);
	}

	void cal() {
		if (mark > 90) {
			grade = 'A';
		}

		else if (80 <= mark || mark <= 90) {
			grade = 'B';
		} else if (70 <= mark || mark <= 80) {
			grade = 'C';
		} else if (60 <= mark || mark <= 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
	}

	void display() {
		if (mark > 60) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}
}

package studentmanagement;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  System.out.println("how much students you wanna add :");
		// Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student[] students = new Student[numOfStudents];

		// Create n number of new students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
		}

		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n]);
		}



	}

	}

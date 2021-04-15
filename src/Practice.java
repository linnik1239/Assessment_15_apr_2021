import java.io.BufferedReader;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;





public class Practice {
	
	
	public static void searchStudentBinary( Student[] students,int prn,int first,int last,int middle) {
		if(students[middle].getPrn()==prn) {
			System.out.println("Name: "+students[middle].getName()+" Address: "+students[middle].getAddress()+" Prn: "+students[middle].getPrn());
			return;
		}
		
		if(first>=last) {
			System.out.println("Error, the student with prn, "+prn+" was not found.");
            return; 
		}
		
		if(students[middle].getPrn()>prn) {
			
			searchStudentBinary(students,prn,first,middle-1,(first+middle)/2);
		}
		else {
			searchStudentBinary(students,prn,middle+1,last,(last+middle+1)/2);

		}
		
	}
	
	
	public static void searchStudent( Student[] students,int prn) {
		int len = students.length;
		for(int i=0;i<len;++i) {
			if(students[i].getPrn()==prn) {
				System.out.println("Name: "+students[i].getName()+" Address: "+students[i].getAddress()+" Prn: "+students[i].getPrn());
				return;
			}
		}
		
		System.out.println("Error, the student with prn, "+prn+" was not found.");
		
	}
	
	
	public static void main(String[] args) {
          Student[] students = new Student[5];
          students[0] = new Student(22,"Mike","Seattle");
          students[1] = new Student(33,"Dave","New-York");
          students[2] = new Student(44,"Mickey","Los-Angeles");
          students[3] = new Student(55,"Jorge","Baltimor");
          students[4] = new Student(66,"Bill","Washington");
          
          Scanner scn = new Scanner(System.in);
          System.out.println("Give the pen of the student");
          
          int prn = scn.nextInt();
          
          searchStudent(students,prn);  // Linear search, O(n)
          
          searchStudentBinary(students,prn,0,students.length-1,(students.length)/2);
          // Binary search O(log n) 
          
          
        
    }

	
}

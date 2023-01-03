package amassignment;

import java.util.ArrayList;
import java.util.Collections;

//student class
public class student {

    int number;
    String major;
    String name;
    double gpa;

    public student(int number, String major, String name, double gpa) {
        this.number = number;
        this.major = major;
        this.name = name;
        this.gpa = gpa;

    }
}

//Node class
class node {

    student studenta;
    node next;

    public node() {
        studenta = new student(0, "Not defined", "Not defined", 0.0);
        next = null;

    }

    public node(student a) {

        studenta = a;
        next = null;

    }

}

//Ordered singly linked list class
class linkedList {

    node head;

    public linkedList() {

        head = null;
    }


    public void addStudent(student s) {

        node n = new node(s);
        node ptr = head;
        node prev = null; 

        while (ptr != null) {
            if (ptr.studenta.number > s.number) {
                break; 
            }
            else{
            
            prev = ptr; 
             ptr = ptr.next;
            }
            

           

        }
        
        if(prev == null){
        n.next = head; 
        head = n; 
        
        }
        else{
        n.next = prev.next; 
        prev.next = n; 
        
        
        }

    }

  
    public void removeStudent(int stNum) {

        node ptr1 = head;
        node ptr2 = null; 
        
        while (ptr1 != null) {
            if (ptr1.studenta.number == stNum) {
                break; 

            } else {
               ptr2 = ptr1; 
               ptr1 = ptr1.next; 
            }

        }
        
        if(ptr1 != null){
            if(ptr2==null){
            head = head.next; 
            
            }
            else{
            
            ptr2.next = ptr1.next; 
            }
        
        
        }
        else{
        
            System.out.println("Not found...");
        }

    }

   
    public ArrayList getStudents(String M) {

        node ptr = head;

        ArrayList<String> namesArr = new ArrayList<String>();

        while (ptr != null) {

            if (ptr.studenta.major == M) {
                namesArr.add(ptr.studenta.name);

            }
            ptr = ptr.next;

        }
        Collections.sort(namesArr);
        return namesArr;

    }


    public node FindStudent(String StName) {
        node ptr = head;
        while (ptr != null) {
            if (ptr.studenta.name == StName) {
                System.out.println("Name : " + ptr.studenta.name + ", Major : " + ptr.studenta.major
                        + ", Number : " + ptr.studenta.number + ", GPA: " + ptr.studenta.gpa
                );
              

            } /*else {
                System.out.println("Student not found..");

            }*/
            ptr = ptr.next;

        }
        return ptr;

    }

    public node FindStudent(int StNum) {
        node ptr = head;
        while (ptr != null) {
            if (ptr.studenta.number == StNum) {
                System.out.println("Name : " + ptr.studenta.name + ", Major : " + ptr.studenta.major
                        + ", Number : " + ptr.studenta.number + ", GPA: " + ptr.studenta.gpa
                );
              

            } /*else {
                System.out.println("Student not found..");
                

            }*/
            ptr = ptr.next;

        }
        return ptr;

    }

  
    public void FindTopOne() {

        node ptr = head;
        double maxGpa = ptr.studenta.gpa;
        student topSt = ptr.studenta;

        while (ptr != null) {

            if (ptr.studenta.gpa > maxGpa) {
                maxGpa = ptr.studenta.gpa;
                topSt = ptr.studenta;

            }

            ptr = ptr.next;

        }
        System.out.println("Name : " + topSt.name + ", Major : " + topSt.major
                + ", Number : " + topSt.number + ", GPA: " + topSt.gpa);

    }

  
    public void print(int StNum) {
        node ptr = head;
        while (ptr != null) {
            if (ptr.studenta.number == StNum) {
                System.out.println("Name : " + ptr.studenta.name + ", Major : " + ptr.studenta.major
                        + ", Number : " + ptr.studenta.number + ", GPA: " + ptr.studenta.gpa
                );
               

            }/* else {
                System.out.println("Student not found..");

            }*/
            ptr = ptr.next;

        }

    }

}
